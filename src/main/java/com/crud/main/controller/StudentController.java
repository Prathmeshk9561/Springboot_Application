package com.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.main.entity.Student;
import com.crud.main.service.StudentService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createStudent")
	public String SaveStudent(@RequestBody Student stud) {
		studentService.SaveStudent(stud);
		return "Record Created Successfully with Name: "+stud.getName()+" & Roll: "+stud.getRoll();
	}
	
	@GetMapping("/findAll")
	public List<Student> findAllStudent() {
		System.out.println("Found All The Elements..!");
		return studentService.findAllStudent();
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Student> findById(@PathVariable Long id){
		System.out.println("FOund The Record With Id "+id);
		return studentService.findById(id);
	}
	
	@PutMapping("/updateById/{id}")
	public String updateById(@PathVariable Long id,@RequestBody Student s) {
		return studentService.updateById(id, s);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "Record With Id "+id+" Deleted Succesfully";
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllStudent() {
		return studentService.deleteAllStudent();
	}
}
