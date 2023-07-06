package com.rays.user;

public class UserBean {
	private int id;
	private String name;
	private int salary;
	private int address;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setAddress(int address) {
		this.address = address;
	}
	public int getAddress() {
		return address;
	}

}
