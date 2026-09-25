# 📝 To-Do Application

A simple and responsive To-Do web application built with **Spring Boot, Thymeleaf, Bootstrap, and MySQL**.
The application allows users to create, manage, update, and delete tasks through a clean and user-friendly interface.

📁 **Repository:** [GitHub Repository](.)

---

## 🚀 Features

- ➕ **Create Tasks** – Add new tasks to your to-do list.
- ✏️ **Update Tasks** – Edit existing tasks whenever needed.
- 🗑️ **Delete Tasks** – Remove tasks that are no longer required.
- 📋 **Task Management** – View and manage all your tasks in one place.
- 💾 **Database Persistence** – Store tasks permanently using MySQL.
- 🎨 **Responsive UI** – Clean and user-friendly interface built with Bootstrap.

---

## 🛠️ Tech Stack

- **Java** – Programming language
- **Spring Boot** – Backend framework
- **Spring MVC** – Web application architecture
- **Spring Data JPA** – Database interaction
- **Thymeleaf** – Server-side HTML rendering
- **Bootstrap** – UI styling and responsive design
- **MySQL** – Relational database
- **Maven** – Dependency management and build tool

---

## 📂 Project Structure

```text
todoApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/todoApp/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── TodoAppApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── tasks.html
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md