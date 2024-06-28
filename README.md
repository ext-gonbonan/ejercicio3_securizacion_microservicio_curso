# Ejercicio 1: Desarrollo de Microservicio CRUD de Cursos

## Descripción del Proyecto

Este proyecto implementa un microservicio RESTful para la gestión de cursos educativos. Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para entidades de tipo Curso, permitiendo una gestión eficiente de la información de cursos en una plataforma educativa.

### Características Principales:

- Creación de nuevos cursos con detalles como código, nombre, duración y precio.
- Consulta de cursos individuales o listado completo de cursos disponibles.
- Actualización de la información de cursos existentes.
- Eliminación de cursos del sistema.
- Búsqueda de cursos por rango de precios.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot 3.3.1**: Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA**: Para la persistencia de datos y operaciones CRUD.
- **MySQL**: Sistema de gestión de base de datos relacional.
- **Maven**: Herramienta de gestión y construcción del proyecto.
- **Lombok**: Biblioteca para reducir el código boilerplate.
- **Spring Boot DevTools**: Para el reinicio automático durante el desarrollo.

## Configuración y Ejecución del Proyecto

### Prerrequisitos

- JDK 17 o superior
- Maven 3.6 o superior
- MySQL 8.0 o superior

## Configuración y Ejecución del Proyecto

### Prerrequisitos

- JDK 17 o superior
- Maven 3.6 o superior
- MySQL 8.0 o superior

### Pasos para Configurar

1. **Clonar el Repositorio**
- https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos.git
   
2. **Configurar la Base de Datos**:
- Crea una base de datos MySQL llamada `cursosdb`.
- Actualiza el archivo `src/main/resources/application.properties` con tus credenciales de MySQL:
  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/cursosdb
  spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña
  ```
- **Inicialización de Datos**: 
     - La aplicación está configurada para crear automáticamente 50 registros de cursos al iniciar.
     - Esta inicialización se realiza a través de un `CommandLineRunner` en la clase principal de la aplicación.
     - Los cursos incluyen una variedad de temas, con énfasis en programación Java y otras tecnologías relevantes.
     - La inicialización solo ocurre si la base de datos está vacía para evitar duplicados.
  
3. **Compilar el Proyecto**:
- mvn clean install
 
### Ejecución del Proyecto

1. **Iniciar la Aplicación**:
- mvn spring-boot:run

### Endpoints Disponibles

- `GET /cursos`: Obtiene todos los cursos.
- `GET /cursos/{codCurso}`: Obtiene un curso específico por su código.
- `POST /cursos`: Crea un nuevo curso.
- `PUT /cursos/{codCurso}/{duracion}`: Actualiza la duración de un curso.
- `DELETE /cursos/{codCurso}`: Elimina un curso.
- `GET /cursos/precios/{precioMin}/{precioMax}`: Obtiene cursos dentro de un rango de precios usando una función Spring Data JPA.
- `GET /cursos/precios2/{precioMin}/{precioMax}`: Obtiene cursos dentro de un rango de precios usando una función QUERY

## Ejemplos de Uso con Postman

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/f37cf122-e93b-4685-99db-979f1a1ae8de)

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/c74a68c1-9d08-44f2-b452-3e7591a8a790)

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/a60ac066-bf80-4d12-8bfb-a3f693cb59a2)

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/c761af66-d3ab-41c7-9856-c362c6411298)

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/5bdfa5bf-52d7-4b92-90c6-648f55992cf8)
![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/f4e15166-ecd7-4fa3-9a42-9b72f298b9dc)

![imagen](https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos/assets/173496006/fadbb719-2679-4ba0-af80-87bd4e84e14f)








