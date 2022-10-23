package com.ozkan.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozkan.springdemo.dao.StudentDAO;
import com.ozkan.springdemo.entity.Student;

@Service
public class StudentServiceImpI implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		studentDAO.saveStudent(theStudent);
	}

	@Override
	@Transactional
	public Student getStudents(int theId) {
		return studentDAO.getStudents(theId);
	}

	@Override
	@Transactional
	public void deleteStudent(int theId) {
		studentDAO.deleteStudent(theId);
	}

}
