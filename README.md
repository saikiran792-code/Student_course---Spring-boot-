# Student-Course Management System

## 📌 Project Overview

Student-Course Management System is a full-stack web application developed using Spring Boot, Spring Data JPA, MySQL, and React. The application allows administrators to manage students and courses efficiently while maintaining relationships between them.

The project demonstrates CRUD operations, RESTful API development, database relationships, and modern backend development practices.

---

## 🚀 Features

### Student Management

* Add Student
* View All Students
* View Student by ID
* Update Student Details
* Delete Student

### Course Management

* Add Course
* View All Courses
* Search Course by Name
* Update Course Details
* Delete Course

### Relationship Management

* One Course can have multiple Students
* Each Student belongs to one Course
* Implemented using JPA One-to-Many and Many-to-One relationships

### Additional Features

* Custom Finder Methods
* REST APIs
* MySQL Database Integration
* Exception Handling
* Layered Architecture
* Git & GitHub Version Control

---

## 🛠️ Tech Stack

### Backend

* Java 23
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven

### Database

* MySQL

### API Testing

* Postman

### Version Control

* Git
* GitHub

---

## 📂 Project Structure

Backend Architecture

Controller Layer

* Handles HTTP Requests

Service Layer

* Business Logic

Repository Layer

* Database Operations

Entity Layer

* JPA Models

---

## 🗄️ Database Design

### Course

| Field | Type    |
| ----- | ------- |
| cid   | Integer |
| cname | String  |
| fees  | Double  |

### Student

| Field   | Type        |
| ------- | ----------- |
| id      | Integer     |
| name    | String      |
| address | String      |
| favSub  | String      |
| fees    | Double      |
| c_id    | Foreign Key |

---

## 🔗 Entity Relationship

Course (1)
|
| OneToMany
|
Student (Many)

---

## 📡 REST APIs

### Student APIs

GET /Api/Allstudents

GET /Api/Student/{id}

POST /Api/newStudent

PUT /Api/UpdateStudent/{id}

DELETE /Api/deleteStudent/{id}

### Course APIs

GET /Courses/allcourses

GET /Courses/name/{cname}

POST /Courses/newCourse

PUT /Courses/updateCourse/{id}

DELETE /Courses/deleteCourse/{id}

---

## ▶️ Run Locally

### Clone Repository

git clone https://github.com/saikiran792/student-course-management-system.git

### Navigate to Project

cd student-course-management-system

### Configure Database

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb

spring.datasource.username=root

spring.datasource.password=yourpassword

### Run Application

mvn spring-boot:run

---

## Future Enhancements

* React Dashboard
* Search Functionality
* Pagination
* Validation
* DTO Pattern
* Swagger Documentation
* Spring Security
* JWT Authentication
* Role-Based Authorization
* Cloud Deployment

---

## Resume Highlights

* Developed a Student-Course Management System using Spring Boot and MySQL.
* Implemented RESTful APIs for Student and Course management.
* Designed One-to-Many and Many-to-One relationships using JPA/Hibernate.
* Applied layered architecture with Controller, Service, Repository, and Entity layers.
* Integrated MySQL database and tested APIs using Postman.
* Version controlled the project using Git and GitHub.

---

## Author

Sai Kiran

Aspiring Java Full Stack Developer
