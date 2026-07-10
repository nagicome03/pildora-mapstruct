# MapStruct Demo con Spring Boot

Proyecto de demostración desarrollado con **Spring Boot** para mostrar cómo **MapStruct** simplifica el mapeo entre entidades y DTOs, eliminando código repetitivo y mejorando la mantenibilidad de una aplicación Java.

Este proyecto ha sido creado como material de apoyo para una presentación sobre **MapStruct en Spring Boot**, donde se compara el mapeo manual con el mapeo automático.

---

## 📚 Objetivos

- Comprender qué es un **DTO (Data Transfer Object)**.
- Identificar el problema del código repetitivo (*boilerplate*) al convertir objetos manualmente.
- Comparar el mapeo manual con el mapeo utilizando MapStruct.
- Aprender cómo integrar MapStruct en un proyecto Spring Boot.
- Conocer las ventajas de generar el código de mapeo en tiempo de compilación.

---

## 🛠️ Tecnologías utilizadas

- Java 25
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Lombok
- MapStruct

---

## 📁 Estructura del proyecto

```
src
└── main
    ├── java
    │   └── com.ejemplo.demo_mapstruct
    │       ├── controller
    │       │   └── PersonaController.java
    │       ├── dto
    │       │   └── PersonaDTO.java
    │       ├── entity
    │       │   └── Persona.java
    │       ├── mapper
    │       │   └── PersonaMapper.java
    │       ├── repository
    │       │   └── PersonaRepository.java
    │       ├── service
    │       │   └── PersonaService.java
    │       └── DemoMapstructApplication.java
    └── resources
        └── application.properties
```

---

## 🏛️ Arquitectura

```
Cliente (Postman)

        │
        ▼

PersonaController

        │
        ▼

PersonaService

        │
        ▼

PersonaMapper

        │
        ▼

PersonaRepository

        │
        ▼

Base de datos (H2)
```

---

## 📌 ¿Qué hace cada capa?

### Entity

Representa el modelo de datos que se almacena en la base de datos.

### DTO

Objeto utilizado para transportar datos entre capas sin exponer directamente la entidad.

### Repository

Gestiona el acceso a la base de datos mediante Spring Data JPA.

### Service

Contiene la lógica de negocio y coordina la comunicación entre el controlador, el repositorio y el mapper.

### Mapper

Se encarga de convertir entre `Persona` y `PersonaDTO`.

En este proyecto se compara:

- Mapeo manual
- Mapeo automático con MapStruct

### Controller

Expone los endpoints REST para interactuar con la aplicación.

---

# 🚀 Ejecución

Clonar el repositorio:

```bash
git clone https://github.com/TU_USUARIO/demo-mapstruct.git
```

Entrar en el proyecto:

```bash
cd demo-mapstruct
```

Ejecutar la aplicación:

```bash
./mvnw spring-boot:run
```

o desde VS Code utilizando la extensión de Spring Boot.

---

## 🧪 Endpoint disponible

### Crear una persona

**POST**

```
/personas
```

Ejemplo de petición:

```json
{
    "nombre": "Ana",
    "apellido": "García",
    "email": "ana@gmail.com",
    "telefono": "600123456",
    "direccion": "Calle Mayor 12",
    "fechaNacimiento": "1998-05-14",
    "activo": true
}
```

Respuesta:

```json
{
    "id": 1,
    "nombre": "Ana",
    "apellido": "García",
    "email": "ana@gmail.com",
    "telefono": "600123456",
    "direccion": "Calle Mayor 12",
    "fechaNacimiento": "1998-05-14",
    "activo": true
}
```

# ✨ ¿Por qué utilizar MapStruct?

- Reduce el código repetitivo (*boilerplate*).
- Genera el código de mapeo automáticamente.
- Detecta errores durante la compilación.
- No utiliza reflexión en tiempo de ejecución.
- Mejora la legibilidad y el mantenimiento del código.
- Se integra fácilmente con Spring Boot.

---

# 📖 Conceptos clave

### DTO (Data Transfer Object)

Objeto utilizado para transportar datos entre distintas capas de la aplicación.

### Mapper

Clase o interfaz responsable de convertir un objeto en otro.

### Convención sobre configuración

Si dos atributos tienen el mismo nombre y tipo, MapStruct los mapea automáticamente.

Solo es necesario utilizar `@Mapping` cuando los nombres son diferentes.

Ejemplo:

```java
@Mapping(source = "nombre", target = "nombreCompleto")
PersonaDTO toDTO(Persona persona);
```

---

Pildora Femcoders P9 - backend.
