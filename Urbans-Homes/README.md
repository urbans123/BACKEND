# Urbans Homes API

This repository contains a simple Spring Boot application named *Urbans Homes*.
It provides RESTful services and a web interface related to real estate management
(inmuebles, contratos de arriendo, pagos, propietarios, inquilinos y servicios).

## Estructura del proyecto

- **src/main/java/NEOAPI/Urbans/Homes/**: código fuente de la aplicación.
  - `UrbansHomesApplication.java` es la clase principal de arranque.
  - `Modelos/` contiene las entidades JPA del dominio (Inmuebles, Propietarios, etc.).
- **src/main/resources/**: configuraciones Spring Boot y recursos estáticos/plantillas.
- **src/test/java/**: pruebas unitarias básicas generadas por el arquetipo de Spring Boot.
- **pom.xml**: descriptor de Maven controla dependencias y plugins.
- **mvnw / mvnw.cmd**: wrappers de Maven para construcción independiente del entorno.

## Requisitos previos

- Java 17 (u otra versión compatible con Spring Boot 4.x).
- Maven instalado o usar los wrappers (`./mvnw` / `mvnw.cmd`).

## Cómo ejecutar

```bash
cd "Urbans Homes/Urbans-Homes"
./mvnw spring-boot:run     # en Linux/macOS
mvnw.cmd spring-boot:run   # en Windows
```

La aplicación estará disponible en `http://localhost:8080`.

## Ejecutar pruebas

```bash
./mvnw test
```

## Notas

- El paquete raíz es `NEOAPI.Urbans.Homes`.
- Configuración adicional puede añadirse en `src/main/resources/application.properties`.

## Recursos y documentación

Este proyecto utiliza tecnologías estándar de Spring Boot y Maven. Para
obtener más información, consulte los enlaces de ayuda en `HELP.md`.

---

> **Aviso:** el paquete original `NEOAPI.Urbans Homes` no es válido;
> se substituyó por `NEOAPI.Urbans.Homes`.
