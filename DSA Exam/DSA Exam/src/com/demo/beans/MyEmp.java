package com.demo.beans;

public class MyEmp {
	private int eid;
	private String fname;
	private String gender;
	
	
	public MyEmp() {
		super();
	}
	
	public MyEmp(int eid, String fname, String gender) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.gender = gender;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MyEmp [eid=" + eid + ", fname=" + fname + ", gender=" + gender + "]";
	}
	
	
}
