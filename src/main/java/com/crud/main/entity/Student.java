package com.crud.main.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	
	@Column(name="name")
	String name;
	
	@Column(name="roll")
	Long roll;
	
	@Column(name="dept")
	String dept;
	
	@Column(name="marks")
	Long marks;
	
	@Column(name="email")
	String email;
	
	public Student() {}
	
	public Student(String name, Long roll, String dept, Long marks, String email) {
		this.name = name;
		this.roll = roll;
		this.dept = dept;
		this.marks = marks;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
