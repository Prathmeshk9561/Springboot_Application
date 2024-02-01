# Student Management CRUD Application

This Spring Boot application provides CRUD (Create, Read, Update, Delete) functionality for managing student records.

## Dependencies Used

- **Spring Boot Web**: For building web applications using Spring MVC.
- **Spring Boot Data JPA**: For easy integration with JPA (Java Persistence API).
- **Spring MySQL**: Database for storing student records during development.

## REST API Endpoints

- **POST http://localhost:8020/createStudent**: Create a new student.Retrieve all students.
- **GET http://localhost:8020/findAll**: Retrieve all students.
- **GET http://localhost:8020/findById/{id}**: Retrieve student using Id.
- **PUT http://localhost:8020/updateById/{id}**: Update an existing student.
- **DELETE http://localhost:8020/deleteById/{id}**: Delete a student by ID.
- **DELETE http://localhost:8020/deleteAll**: Delete all students.
  
## Result Screenshots (Tested All API Endpoints using POSTMAN Tool)

- **Created A New Student**: ![createStud](screenshots/createStud.png)
- **Find Student Data Using Id**: ![find student](screenshots/findById.png)
- **Display All The Student Records**: ![all Student](screenshots/findAll.png)
- **Update Student Info. By Their Id's**: ![Edit Student](screenshots/updateById.png)
- **Delete Student Data Using Id**: ![delete by id](screenshots/deleteById.png)
- **Delete All The Student Records**: ![delete all](screenshots/deleteAll.png)


## Usage

1. Access the application at `http://localhost:8020`.
2. Use the provided REST API endpoints to perform CRUD operations on student records.

## Contributing

Contributions are welcome! Please feel free to submit a pull request.

