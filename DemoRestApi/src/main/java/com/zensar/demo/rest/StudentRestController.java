package com.zensar.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.demo.bean.Student;
import com.zensar.demo.service.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService service;
	
	//Add Method
	@PostMapping("/student")
	public Student addStudentDetails(@RequestBody Student student) {
		return this.service.addStudent(student);
	}
	
	//Read Method
	@GetMapping("/student/details")
	public List<Student> findStudents() {
		return this.service.getAllDetails();
	}
	
	
	//Update Method
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student request,@PathVariable(name ="id") int id) {
		Student student=this.service.findStudent(id);
		student.setName(request.getName());
		student.setPhoneNumber(request.getPhoneNumber());
		
		Student stu=this.service.updateStudent(student);
		return stu;
	}
	
	//Delete method
	@DeleteMapping("/student/{id}")
	public boolean deleteStudent(@PathVariable(name = "id") int id) {
		Student student = this.service.findStudent(id);
		System.out.println(student);
		return this.service.deleteStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable(name = "id") int id) {
		return this.service.findStudent(id);
	}
	
	
}