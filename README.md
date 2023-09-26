# CRUD Curso - Documentación

## Descripción
Este proyecto es una aplicación de ejemplo que implementa un CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar cursos. La aplicación permite realizar las siguientes operaciones:

- Obtener la lista de todos los cursos.
- Obtener un curso por su código.
- Dar de alta un nuevo curso.
- Actualizar las horas de un curso.
- Eliminar un curso por su código.

La aplicación está construida en Java y utiliza Spring Boot para crear un servicio REST que expone las operaciones mencionadas.

## Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

- `src/main/java/com/viewnext/kidaprojects/crudcurso/model`: Contiene la clase `Curso`, que representa el modelo de datos de un curso.
- `src/main/java/com/viewnext/kidaprojects/crudcurso/service`: Contiene la interfaz `CursoService` y su implementación `CursoServiceImpl`, que define y realiza las operaciones de gestión de cursos.
- `src/main/java/com/viewnext/kidaprojects/crudcurso/exception`: Contiene la excepción personalizada `CursoNotFoundException`, que se lanza cuando no se encuentra un curso.
- `src/main/java/com/viewnext/kidaprojects/crudcurso/controller`: Contiene el controlador REST `CursoRestController`, que define los puntos de entrada de la API y gestiona las solicitudes HTTP.
- `src/main/java/com/viewnext/kidaprojects/crudcurso/CrudCursoApplication.java`: La clase principal que inicia la aplicación Spring Boot.

## Instrucciones de Uso
Puedes utilizar esta aplicación para realizar operaciones CRUD en cursos. Aquí hay algunos ejemplos de cómo usarla:

### Obtener la lista de todos los cursos
- Método: GET
- URL: `http://localhost:8080/cursos`

### Obtener un curso por su código
- Método: GET
- URL: `http://localhost:8080/curso/{codigo}`

### Dar de alta un nuevo curso
- Método: POST
- URL: `http://localhost:8080/curso`
- Cuerpo de la solicitud (JSON):
  ```json
  {
    "codigo": "C021",
    "nombre": "Introducción a la Programación Avanzada",
    "numeroHoras": 60,
    "precio": 350
  }
  
### Actualizar las horas de un curso
- Método: PUT
- URL: `http://localhost:8080/curso`
- Parámetros de solicitud (URL):
  - `codigo`: Código del curso que se va a actualizar.
  - `horas`: Nuevas horas del curso.
  
### Eliminar un curso por su código
- Método: DELETE
- URL: `http://localhost:8080/curso/{codigo}`

### Uso de Postman
Puedes utilizar herramientas como [Postman](https://www.postman.com/) para probar y consumir la API de manera más conveniente. Simplemente crea solicitudes HTTP en Postman con las URL y los datos de solicitud correspondientes.
  

## Requisitos
Asegúrate de tener instalado lo siguiente antes de ejecutar la aplicación:

- Java 8 o superior.
- Eclipse o cualquier otro IDE de tu elección.
- Maven para gestionar las dependencias del proyecto.

## Ejecución
Para ejecutar la aplicación, sigue estos pasos:

1. Abre el proyecto en tu IDE (por ejemplo, Eclipse).

2. Busca la clase `CrudCursoApplication` en el paquete `com.viewnext.kidaprojects.crudcurso`.

3. Haz clic derecho en la clase y selecciona "Run as" (Ejecutar como) > "Java Application" (Aplicación Java).

4. La aplicación se iniciará en `http://localhost:8080`. Puedes acceder a la API utilizando las URL mencionadas anteriormente.

## Contribución
Si deseas contribuir a este proyecto, ¡te damos la bienvenida! Puedes fork el repositorio y enviar tus contribuciones a través de pull requests.

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

¡Gracias por usar `crud_curso`!
  