# Habity - Backend API (Spring Boot)

Este repositorio contiene el backend de Habity, una plataforma para la creación de hábitos, seguimiento personalizado, publicaciones y recomendaciones. Este componente expone una API RESTful desarrollada con Spring Boot y PostgreSQL, integrando autenticación JWT y conexión con servicios externos.

## Funcionalidades clave

- Registro e inicio de sesión con JWT
- Creación y seguimiento de hábitos
- Registro de progreso diario
- Publicaciones y reacciones tipo red social
- Generación de reportes por usuario
- API RESTful organizada por recursos (/usuarios, /habitos, /publicaciones, etc.)

## Tecnologías y herramientas

- Java 17
- Spring Boot 3
- Spring Security (JWT)
- Hibernate JPA
- PostgreSQL (Railway)
- Maven
- Git + GitHub

## Seguridad

Autenticación implementada mediante JWT.  
Las rutas públicas (/api/auth/**) permiten login y registro.  
Todas las demás requieren token válido en Authorization: Bearer.

## Endpoints documentados

La documentación del API incluye:
- Rutas por entidad (/api/usuarios, /api/habitos, etc.)
- Métodos HTTP permitidos
- Parámetros y estructura del request/response
- Ejemplos de uso
- Status de respuesta
¿

## Configuración local

1. Crear base de datos habitydb en PostgreSQL
2. Crear archivo src/main/resources/application.properties con:

spring.datasource.url=jdbc:postgresql://localhost:5432/habitydb  
spring.datasource.username=postgres  
spring.datasource.password=***  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
server.port=8080

3. Ejecutar el proyecto con:

./mvnw spring-boot:run

## Producción

Backend desplegado en Railway:  
https://habity-backend.up.railway.app

Variables configuradas en Railway:
- SPRING_DATASOURCE_URL
- SPRING_DATASOURCE_USERNAME
- SPRING_DATASOURCE_PASSWORD

## Software Development Configuration

Este repositorio forma parte de la configuración del ciclo de vida de desarrollo. Se gestiona con GitHub, incluye ramas de desarrollo y evidencias de trabajo colaborativo.

## Autores

- Romario Rodriguez  
- Dylan Tong Barahona  
- Chalco Falcón David Alonso  
- Chunga Vásquez Karla  
- Alvarez Augusto  

Proyecto Final - SI705 Arquitectura de Aplicaciones Web (202402)