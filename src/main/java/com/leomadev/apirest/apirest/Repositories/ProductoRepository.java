package com.leomadev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leomadev.apirest.apirest.Entities.Producto;
                                                    //se tiene que poner la <entidad,
                                                    // y tipo de dato del identificador (Id)
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
