# Servicio de Proveedores

Este proyecto es una aplicación en Java que implementa un microservicio utilizando Spring Boot para consultar y obtener datos de proveedores desde una base de datos.

## Requisitos previos
Antes de ejecutar la aplicación, asegúrate de tener instalado lo siguiente:
* Java Development Kit (JDK) 17 o una versión superior.
* Maven para gestionar las dependencias.
* Tener acceso a una base de datos PostgreSQL (version 15)


## Configuración y ejecución
Sigue los pasos a continuación para configurar y ejecutar la aplicación:
1. Clona este repositorio o descarga el código fuente. `git clone https://github.com/licuevas98/providers.git`
2. Accede al directorio del proyecto.
`cd providers`
3. Compila el proyecto utilizando Maven.
   `mvn clean install`
4. Añade las variables de entorno `export PostgresDbHost=?; export PostgresDbPort=?; export PostgresDbName=?; export PostgresDbUserName=?; export PostgresDbPassword=?;` reemplazando el signo de pregunta por el valor real.
5. Ejecuta la aplicación.
   `mvn spring-boot:run`

En caso de ser necesario, para tener datos en la base de datos existe un archivo `db/import.sql` que crea unos datos de prueba. Solo es necesario ejecutar este archivo en la base de datos para crearlos. Esto solo debe hacerlo en caso de que no existan datos al ejecutar el servicio.

La aplicación se ejecutará y estará disponible en http://localhost:8080

## Endpoints

La aplicación expone los siguientes endpoints:

* `GET /providers/{codigoCliente}`: Obtiene un array de proveedores y sus datos para el código de cliente especificado. Si no hay registros, devuelve un array vacío.
* `GET /providers/all`: Obtiene un array de todos los proveedores y sus datos. Si no hay registros, devuelve un array vacío.

## Pruebas unitarias

Las pruebas unitarias se han implementado utilizando JUnit 5. Puedes ejecutar las pruebas mediante el siguiente comando:
`mvn test`

## Dependencias utilizadas

En este proyecto, se han utilizado las siguientes dependencias principales:
* Spring Boot: Framework para el desarrollo de aplicaciones Java.
* Spring Data JPA: Biblioteca para el acceso a la base de datos utilizando JPA.
* H2 Database: Base de datos en memoria para el entorno de desarrollo y pruebas.
* JUnit 5: Biblioteca para escribir y ejecutar pruebas unitarias en Java.
* Flyway: Para el control de versiones de la base de datos.
* Lombok: Biblioteca para reducir la cantidad de código repetitivo en las clases Java, generando automáticamente getters, setters, constructores, entre otros.
* PostgreSQL Driver: Controlador JDBC para la conexión con una base de datos PostgreSQL.

Puedes encontrar la lista completa de dependencias y sus versiones en el archivo `pom.xml`.
