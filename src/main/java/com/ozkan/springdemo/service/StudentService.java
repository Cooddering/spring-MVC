package com.ozkan.springdemo.service;

import java.util.List;

import com.ozkan.springdemo.entity.Student;

public interface StudentService {

	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int theId);

	public void deleteStudent(int theId);
	
	
}
