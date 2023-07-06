package com.rays.marksheet;

public class MarksheetBean {
	private int id;
	private int RollNumber;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
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
	
	public void setRoll_number(int RollNumber) {
		this.RollNumber = RollNumber;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getPhysics() {
		return physics;
	}
	
	public void setchemitry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getChemistry() {
		return chemistry;
	}
	
	public void setMaths(int maths) {
		this.maths = maths;
		
	}
	public int getMaths() {
		return maths;
	}
	

}
