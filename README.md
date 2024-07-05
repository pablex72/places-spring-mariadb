
## Ejecucion del proyecto con docker-compose, Dockerfile(app-spring) & Postgres


- Crea dos contenedores: database para la base de datos PostgreSQL y backcontainering22 para tu aplicación Spring Boot.

- PostgreSQL indica que ya contiene una base de datos y no necesita inicialización.

- PostgreSQL se inicia correctamente y está listo para aceptar conexiones en el puerto 5432.

- La aplicación Spring Boot (backcontainering22) se inicia utilizando Java 17.0.2.

- Se inicializan los repositorios JPA y el servidor web Tomcat en el puerto 8080.

- Flyway ejecuta la validación de migraciones y determina que el esquema de la base de datos está actualizado.

- Hibernate se inicializa y se advierte que el dialecto de PostgreSQL se selecciona automáticamente, por lo que no es necesario especificarlo explícitamente.

- Se advierte que spring.jpa.open-in-view está habilitado por defecto, lo cual puede afectar el rendimiento durante la representación de vistas.

- La aplicación Spring Boot se inicia completamente en el puerto 8080.

### Para Ejecutar:
* Navega a directorio del proyecto

#### Reconstruir los servicios
* docker-compose build

#### Levantar los servicios y eliminar contenedores ophans (optional)
* docker-compose up --remove-orphans