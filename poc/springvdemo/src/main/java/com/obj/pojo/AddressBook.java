package com.obj.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reader_info")
public class AddressBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String fname;
	String lname;
	String address;
	String state;
	String  landmark;
	int age;
	public AddressBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBook(int id, String fname, String lname, String address, String state, String landmark, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.state = state;
		this.landmark = landmark;
		this.age = age;
	}
	public AddressBook(String fname, String lname, String address, String state, String landmark, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.state = state;
		this.landmark = landmark;
		this.age = age;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
