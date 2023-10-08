package com.tnsif.singledemo;

import com.tnsif.inheritanceprogram.Citizen;

public class Student extends Citizen{

	public Student() {
		super();
		
	}
	private int rollno;
	private String collegename;
	//@override
	//public String toString() {
	      //return "student [rollno=" + rollno + ", collegename=" + collegename + "]";
       //}
	public Student(String name,long aadharno,String address,long phno, int rollno, String collegename) {
		super(name,aadharno,address,phno, phno);
		//TODO Auto-generated constructor
		this.rollno=rollno;
		this.collegename=collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public String getcollegename() {
		return collegename;
	}
	public void setcollegename(String collegename) {
		this.collegename =collegename;
	}
	}
	
