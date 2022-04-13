package com.zensar.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.demo.bean.Student;
import com.zensar.demo.database.StudentDB;


@Service
public class StudentService {

	@Autowired
	StudentDB db;
	
	
	public Student addStudent(Student student) {
		return this.db.save(student);
	}
	
	public Student updateStudent(Student student) {
		return this.db.save(student);
	}
	
	public List<Student> getAllDetails() {
		return this.db.findAll();
	}
	
	public Student findStudent(int id) {
		Optional<Student> optional=this.db.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
		return null;
	}
	
	public boolean deleteStudent(Student student) {
		boolean result=false;
		try {
			this.db.delete(student);
			result=true;
		} catch(Exception e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}
	
	
}
