# CRUD API REST en JAVA 
#### Este proyecto consiste en la implementación de un CRUD (Crear, Leer, Actualizar, Eliminar) servido a través de una API REST desarrollada en Java utilizando Spring Boot, Hibernate y PostgreSQL. 
## Descripción del Proyecto
 Hemos creado una API REST que permite realizar operaciones CRUD sobre una entidad `Producto`. 
La API permite: 
- Crear un nuevo producto. 
 - Obtener la lista de todos los productos. 
 - Obtener un producto por su ID. 
 - Actualizar un producto existente. 
 - Eliminar un producto por su ID. 
## Herramientas Utilizadas  
-  **Spring Boot**: Framework que facilita la creación de aplicaciones Java robustas y escalables con configuración mínima. 
-  **Hibernate**: Framework de mapeo objeto-relacional (ORM) para la gestión de datos en bases de datos relacionales. 
 -  **PostgreSQL**: Sistema de gestión de bases de datos relacional potente y de código abierto. 
 -  **Maven**: Herramienta de gestión y construcción de proyectos Java. 
 -  **Docker**: Plataforma para desarrollar, enviar y ejecutar aplicaciones dentro de contenedores.
## Estructura del Proyecto  
 -  **Controladores**: Manejan las solicitudes HTTP y responden con datos JSON. 
-  **Servicios**: Contienen la lógica de negocio y se comunican con los repositorios. 
 -  **Repositorios**: Interactúan con la base de datos a través de Hibernate. 
 -  **Entidades**: Clases que representan las tablas de la base de datos. 
## Endpoints de la API 
La API proporciona los siguientes endpoints: 
- -  **GET /api/productos**: Obtiene la lista de todos los productos. 
- -  **GET /api/productos/{id}**: Obtiene un producto por su ID. 
- -  **POST /api/productos**: Crea un nuevo producto. 
- -  **PUT /api/productos/{id}**: Actualiza un producto existente. 
- -  **DELETE /api/productos/{id}**: Elimina un producto por su ID.
