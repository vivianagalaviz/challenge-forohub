<h1 align="center">🧵 Challenge ForoHub API</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/SpringBoot-3-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Estado-Finalizado-success?style=for-the-badge" />
</p>

<p align="center">
  Proyecto desarrollado como parte del programa <b>Oracle Next Education (ONE)</b>.
</p>

---

## 📖 Descripción del Proyecto

**ForoHub** es una API REST desarrollada con **Spring Boot** que simula el funcionamiento de un foro donde los usuarios pueden crear, consultar, actualizar y eliminar tópicos.

El proyecto implementa un backend completo que incluye:

- API REST con Spring Boot
- Persistencia de datos con MySQL
- Migraciones de base de datos con Flyway
- Seguridad con Spring Security
- Autenticación mediante JWT
- Arquitectura organizada por capas
- Pruebas de endpoints con Insomnia

La API permite gestionar los tópicos de un foro de forma segura mediante autenticación con token.

---

## 🧵 Arquitectura del Proyecto

El proyecto está organizado siguiendo una estructura modular que separa responsabilidades:

- **Controller** → Manejo de endpoints de la API  
- **Domain** → Entidades, DTOs y repositorios  
- **Infra** → Seguridad, configuración y JWT  

## 🔐 Autenticación

La API utiliza **JWT (JSON Web Token)** para proteger los endpoints.

El usuario debe autenticarse mediante:

Después de autenticarse correctamente, el servidor genera un **token JWT** que debe enviarse en las siguientes solicitudes.

### 📸 Ejemplo de login

![Login JWT](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/login.png)

---

## ⚙️ Endpoints de la API

### Crear tópico


Permite registrar un nuevo tópico en el foro.

![Crear tópico](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/crear-topico.png)

---

### Listar tópicos

Devuelve la lista de todos los tópicos registrados.

![Listar tópicos](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/listar-topicos.png)

---

### Detalle de tópico

Obtiene la información de un tópico específico.

![Detalle tópico](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/detalle-topico.png)

---

### Actualizar tópico

Permite modificar la información de un tópico existente.

![Actualizar tópico](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/actualizar-topico.png)

---

### Eliminar tópico
Elimina un tópico del foro.

![Eliminar tópico](https://github.com/vivianagalaviz/challenge-forohub/blob/2bd557eb51782977ab9ae6adbe5f594d833e6195/eliminar-topico.png)

---

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- MySQL
- Flyway
- Maven
- Lombok
- Insomnia
- IntelliJ IDEA
- Git & GitHub

---

## 🚀 Cómo ejecutar el proyecto

1️⃣ Clonar el repositorio

```bash
git clone https://github.com/vivianagalaviz/challenge-forohub.git
```
2️⃣ Crear la base de datos en MySQL

CREATE DATABASE forohub;

3️⃣ Configurar credenciales en application.properties

spring.datasource.username=tu_usuario
spring.datasource.password=tu_password

4️⃣ Ejecutar la aplicación

ForohubApplication.java

5️⃣ Probar los endpoints usando Insomnia o Postman.

## 🔐 Seguridad

Los endpoints están protegidos mediante JWT.

Flujo de autenticación:

1️⃣ Realizar login en /login
2️⃣ Copiar el token generado
3️⃣ Enviar el token como Bearer Token en las siguientes solicitudes

## 📌 Posibles mejoras futuras

- Implementar paginación en el listado de tópicos

- Agregar sistema de respuestas a tópicos

- Implementar roles de usuario

- Documentación de API con Swagger

- Desarrollar un frontend para el foro

## 👩‍💻 Desarrollado por

- ✨ **Viviana Galaviz** - [@vivianagalaviz](https://github.com/vivianagalaviz)

Proyecto desarrollado durante el programa Oracle Next Education (ONE).



