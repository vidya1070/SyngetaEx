package com.example.demo.Student;

public class Student {
private int id;
private String fname;
private String lname;
private String School;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String fname, String lname, String school) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	School = school;
}
public Student(String fname, String lname, String school) {
	super();
	this.fname = fname;
	this.lname = lname;
	School = school;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getSchool() {
	return School;
}
public void setSchool(String school) {
	School = school;
}

}
