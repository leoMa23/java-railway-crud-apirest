package com.leomadev.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leomadev.apirest.apirest.Repositories.ProductoRepository;

import com.leomadev.apirest.apirest.Entities.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    //esta etiqueta resuelve todo el problema, sabe a que repositorio corresponde y
    //hace una inyeccion de una instancia de ese repositorio
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos(){
        //me trae todos los productos que tenga este repositorio
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    //devuelve el producto tal cual lo encontro
    public Producto getProductoById(@PathVariable Long id ){
        return productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el id: " + id));
    }

    @PostMapping
    //me va a devolver un producto (xq se agrega un producto)
                        //hay q pasarle por parametro un body
                        //se pasa los atributos de producto
    public Producto createProducto(@RequestBody Producto producto){
        //con el .save estamos grabando en la base de datos
        //y tambien devolvemos el producto
        return productoRepository.save(producto);
    }

    @PutMapping("/{id}")
                                //voy a recibir el ID que se quiere modificar,
                                // y tambien el requestbody xq vamos a modificar el producto
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto productoDetails){
        //lo asigno a una variable 
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el id: " + id));
        //le modifico el nombre y el precio
        producto.setNombre(productoDetails.getNombre());
        producto.setPrecio(productoDetails.getPrecio());
        //devuelvo el producto actualizado y lo guardo en la base de datos
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable Long id){
        //buscamos el producto por id
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el id: " + id));
        //en caso de encontrarlo se borra el producto
        productoRepository.delete(producto);
        return "El producto con el ID: " + id + " fue eliminado correctamente";
    }
}
