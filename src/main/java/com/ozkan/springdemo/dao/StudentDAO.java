package com.ozkan.springdemo.dao;

import java.util.List;

import com.ozkan.springdemo.entity.Student;

public interface StudentDAO {

	
	public List <Student>getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int theId);

	public void deleteStudent(int theId);
}
