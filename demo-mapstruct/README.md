# MapStruct Demo

Proyecto de ejemplo desarrollado con Spring Boot para mostrar cómo MapStruct simplifica el mapeo entre entidades y DTOs.

## Objetivos

- Comprender por qué se utilizan los DTO.
- Identificar el problema del código repetitivo al mapear objetos manualmente.
- Comparar un mapper manual con MapStruct.
- Aprender a integrar MapStruct en un proyecto Spring Boot.
- Conocer algunas funcionalidades avanzadas como `@Mapping`.

## Tecnologías

- Java 25
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- MapStruct

## Estructura del proyecto
src
├── controller
├── dto
├── entity
├── mapper
├── repository
└── service


## Flujo de la demostración

1. Mapeo manual entre `Persona` y `PersonaDTO`.
2. Refactorización utilizando MapStruct.
3. Comparación del código generado.
4. Ejemplo de `@Mapping` con nombres de campos diferentes.
