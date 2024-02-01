# Student Management CRUD Application

This Spring Boot application provides CRUD (Create, Read, Update, Delete) functionality for managing student records.

## Dependencies Used

- **Spring Boot Starter Web**: For building web applications using Spring MVC.
- **Spring Boot Starter Data JPA**: For easy integration with JPA (Java Persistence API).
- **Spring MySQL**: An in-memory database for storing student records during development.

## Result Screenshots

- **Home Page**: ![Home Page](screenshots/createStud.png)
- **Student List**: ![Student List](screenshots/student_list.png)
- **Add Student**: ![Add Student](screenshots/add_student.png)
- **Edit Student**: ![Edit Student](screenshots/edit_student.png)

## REST API Endpoints

- **GET /api/students**: Retrieve all students.
- **GET /api/students/{id}**: Retrieve a student by ID.
- **POST /api/students**: Create a new student.
- **PUT /api/students/{id}**: Update an existing student.
- **DELETE /api/students/{id}**: Delete a student by ID.

## Usage

1. Access the application at `http://localhost:8020`.
2. Use the provided REST API endpoints to perform CRUD operations on student records.

## Contributing

Contributions are welcome! Please feel free to submit a pull request.

