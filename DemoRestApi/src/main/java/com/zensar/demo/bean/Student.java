package com.zensar.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;



@Entity
@Table(name="student")
public class Student {

	@NonNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@NonNull
	String name;
	
	@NonNull
	String phoneNumber;
	
	
	public Student() {
		super();
	}
	public Student(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
