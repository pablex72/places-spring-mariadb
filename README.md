# PlacesApplication con MariaDB en Docker

Este proyecto configura una aplicación Spring Boot con una base de datos MariaDB utilizando Docker.

## Pasos e Historial de Ejecución

### Paso 1: Inicializar Contenedor de MariaDB

- **Nombre del Contenedor**: `bbdd_mariadb`
- **Puerto**: 3306

**Registro de Ejecución**:
- Crea sockets de servidor en IP `0.0.0.0` y `::`.
- El servidor MariaDB está listo para conexiones.

### Paso 2: Inicializar Aplicación Spring Boot

- **Nombre del Contenedor**: `backcontainering22WithMariaDb`
- **Puerto**: 8080

**Registro de Ejecución**:
- Inicia `PlacesApplication` usando Java 17.
- Por defecto, usa el perfil "default".
- Inicializa los repositorios de Spring Data JPA.
- El pool de conexiones HikariCP se inicia y se conecta a MariaDB.
- Flyway verifica las migraciones de la base de datos y confirma que el esquema está actualizado.
- Hibernate procesa la información de la unidad de persistencia.
- El servidor Tomcat se inicia y escucha en el puerto 8080.
- La aplicación está completamente operativa.

## Detalles de los Contenedores

- **MariaDB**:
    - **Nombre**: `bbdd_mariadb`
    - **Puerto**: 3306
    - **Registros**: Servidor listo para conexiones.

- **Aplicación Spring Boot**:
    - **Nombre**: `backcontainering22WithMariaDb`
    - **Puerto**: 8080
    - **Registros**:
        - No se ha establecido un perfil activo, por defecto usa "default".
        - HikariCP inicializado y conectado a MariaDB.
        - Verificación de migraciones de Flyway, esquema actualizado.
        - Hibernate inicializado, unidad de persistencia procesada.
        - Servidor Tomcat iniciado en el puerto 8080.

## Configuración y Advertencias

- **Flyway**:
    - Advertencia: La versión de MariaDB 11.4 es más nueva que la versión probada (11.2).
    - Acción: Verificar una versión más reciente de Flyway si es necesario.

- **Hibernate**:
    - Advertencia: La propiedad MySQLDialect no es necesaria explícitamente.
    - Acción: Eliminar la propiedad `hibernate.dialect` de la configuración.

- **Spring JPA**:
    - Advertencia: `spring.jpa.open-in-view` está habilitado por defecto.
    - Acción: Configurar `spring.jpa.open-in-view` explícitamente según tus requerimientos.

## Ejecución de la Aplicación

1. **Iniciar MariaDB**:
   ```sh
   docker-compose up -d bbdd_mariadb

## Considerar no usar SPRING_JPA_HIBERNATE_DDL_AUTO=update
## sino usar el none, si se esta usando flyway, esto puede ir en app properties o en compose