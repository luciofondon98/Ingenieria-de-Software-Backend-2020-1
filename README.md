# Microservicio Paciente Proyecto ISW 2020-1

API REST del microservicio Paciente para el proyecto del ramo Ingeniería de Software.

# Requisitos

- JDK 1.8
- Maven 
- PostgreSQL

Para correr el programa, ejecutar en la terminal:

```
mvn install
mvn spring-boot:run
```
# Notas

- Se debe tener previamente creada una base de datos en PostgreSQL con el nombre de "api".
- Se deben editar las siguientes líneas del archivo  ```application.properties``` para poder ejecutar

```properties:
# opciones de conexion a la base de datos:

#aca cambiar su puerto si es que no usan el 5432
spring.datasource.url=jdbc:postgresql://localhost:5432/api 
#cambiar por el nombre de usuario que ustedes tengan
spring.datasource.username=
#cambiar por la contraseña que ustedes tengan
pring.datasource.password= 
```
