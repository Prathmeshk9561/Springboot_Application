package com.crud.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.main.entity.Student;
import com.crud.main.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	//Create Or Save Student Data
	public Student SaveStudent(Student stud) {
		return studentRepository.save(stud);
	}
	
	//Find All Records of Student
	public List<Student> findAllStudent(){
		return (List<Student>)studentRepository.findAll();
	}
	
	//Find Record By Id 
	public ResponseEntity<Student> findById(Long id){
		java.util.Optional<Student> stud = studentRepository.findById(id);
		if(stud.isPresent()) {
			return new ResponseEntity<Student>(stud.get(),HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Update Record Using Id
	public String updateById( Long id,Student student) {
		java.util.Optional<Student> stud = studentRepository.findById(id);
		if(stud.isPresent()) {
			Student stud_exist = stud.get();
			stud_exist.setName(student.getName());
			stud_exist.setRoll(student.getRoll());
			stud_exist.setMarks(student.getMarks());
			stud_exist.setDept(student.getDept());
			stud_exist.setEmail(student.getEmail());
			studentRepository.save(stud_exist);
			return "Record Updated Using the id "+id;
		}
		else {
			return "Record Not Found For Id "+id;
		}
	}
	
	//Delete Record By Id
	public void deleteStudentById(@PathVariable Long id) {
		studentRepository.deleteById(id);
	}
	
	//Delete All Records
	public String deleteAllStudent() {
		studentRepository.deleteAll();
		return "All Records Deleted";
	}
	
	
}
