package com.example.demo.bean;

import lombok.Data;


public class Student {
private int id;
private String firstname;
private String lastName;
public Student(int id, String firstname, String lastName) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	

}
