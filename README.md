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

- Nota: se deben editar las siguientes líneas del archivo ```application.properties``` para poder ejecutar

```
#data conection
spring.datasource.url=jdbc:postgresql://localhost:5432/api
spring.datasource.username=postgres
spring.datasource.password=1234
```

