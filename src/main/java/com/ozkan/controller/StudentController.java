package com.ozkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ozkan.springdemo.entity.Student;
import com.ozkan.springdemo.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//@RequestMapping("/list")
	@GetMapping("/list")
	public String listStudents(Model theModel) {
		
		List<Student> theStudent = studentService.getStudents();
		
		theModel.addAttribute("student", theStudent);
		
		return "list-student";
		 
	}
	@GetMapping("/showStudentForm")
	public String showStudentForm(Model theModel) {
		
		Student theStudent = new Student();
		theModel.addAttribute("students", theStudent);
		
		return "student-form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		
		studentService.saveStudent(theStudent);
		
		
		return "redirect:/student/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentID") int theId, Model theModel) {
		
		Student theStudent  = studentService.getStudents(theId);
		
		theModel.addAttribute(theStudent);
		
		return "student-form";
	}
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentID") int theId, Model theModel) {
		
		studentService.deleteStudent(theId);
		
		return "redirect:/student/list";
   }

}




