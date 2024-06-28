# Ejercicio 3: Securización Microservicio Curso

## Descripción del Proyecto

Este proyecto implementa un microservicio RESTful securizado para la gestión de cursos educativos. Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para entidades de tipo Curso, permitiendo una gestión eficiente de la información de cursos en una plataforma educativa, con diferentes niveles de acceso según el rol del usuario.

### Características Principales:

- Creación de nuevos cursos con detalles como código, nombre, duración y precio.
- Consulta de cursos individuales o listado completo de cursos disponibles.
- Actualización de la información de cursos existentes.
- Eliminación de cursos del sistema.
- Búsqueda de cursos por rango de precios.
- Securización basada en roles para controlar el acceso a las diferentes operaciones.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot 3.3.1**: Framework para el desarrollo de aplicaciones Java.
- **Spring Security**: Para la implementación de seguridad y control de acceso.
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

### Pasos para Configurar

1. **Clonar el Repositorio**
   - `git clone https://github.com/ext-gonbonan/ejercicio3_securizacion_microservicio_curso.git`
   
2. **Configurar la Base de Datos**:
   - Crea una base de datos MySQL llamada `cursosdb`.
   - Actualiza el archivo `src/main/resources/application.properties` con tus credenciales de MySQL:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/cursosdb
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     ```

3. **Inicialización de Datos**: 
   - La aplicación está configurada para crear automáticamente 50 registros de cursos al iniciar.
   - Esta inicialización se realiza a través de un CommandLineRunner en la clase principal de la aplicación.
   - Los cursos incluyen una variedad de temas, con énfasis en programación Java y otras tecnologías relevantes.
   - La inicialización solo ocurre si la base de datos está vacía para evitar duplicados.
  
4. **Compilar el Proyecto**:
   - `mvn clean install`
 
### Ejecución del Proyecto

1. **Iniciar la Aplicación**:
   - `mvn spring-boot:run`

## Seguridad y Control de Acceso

El proyecto implementa seguridad basada en roles utilizando Spring Security:

### Roles de Usuario:
- INVITADO
- OPERADOR
- ADMIN

### Usuarios Predefinidos:
- user1: INVITADO
- user2: OPERADOR
- user3: ADMIN
- user4: ADMIN, OPERADOR

### Permisos por Rol:
- POST /cursos: Solo ADMIN
- DELETE /cursos/**: ADMIN o OPERADOR
- PUT /cursos/**: ADMIN o OPERADOR
- GET /cursos/** y GET /cursos: Cualquier usuario autenticado

La autenticación se realiza mediante autenticación básica HTTP.

## Endpoints Disponibles

- GET /cursos: Obtiene todos los cursos.
- GET /cursos/{codCurso}: Obtiene un curso específico por su código.
- POST /cursos: Crea un nuevo curso.
- PUT /cursos/{codCurso}/{duracion}: Actualiza la duración de un curso.
- DELETE /cursos/{codCurso}: Elimina un curso.
- GET /cursos/precios/{precioMin}/{precioMax}: Obtiene cursos dentro de un rango de precios usando una función Spring Data JPA.
- GET /cursos/precios2/{precioMin}/{precioMax}: Obtiene cursos dentro de un rango de precios usando una función QUERY

Nota: Todos los endpoints requieren autenticación. Asegúrese de proporcionar las credenciales adecuadas al realizar las solicitudes.







