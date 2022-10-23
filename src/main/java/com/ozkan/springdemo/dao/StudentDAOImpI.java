package com.ozkan.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ozkan.springdemo.entity.Student;

@Repository
public class StudentDAOImpI implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	
	public List<Student> getStudents() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> theQuery = currentSession.createQuery("from student", Student.class);
		
		List<Student> students = theQuery.getResultList();
		
		return students;
	}


	@Override
	public void saveStudent(Student theStudent) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theStudent);
		
	}


	@Override
	public Student getStudents(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Student theStudent = currentSession.get(Student.class, theId);
		
		return theStudent;
	}


	@Override
	public void deleteStudent(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Student where id=:studentId");
		
		theQuery.setParameter("studentId", theId);
		
		theQuery.executeUpdate();
		
	}

}
