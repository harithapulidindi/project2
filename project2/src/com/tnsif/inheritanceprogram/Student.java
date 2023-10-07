package com.tnsif.inheritanceprogram;

public class Student extends Citizen {
	
	public Student() {
		super();
		
		}
        private int rollno;
        private String collegename;
        //@override
        //public String toString() {
            //return "Student[rollno=" + rollno + ", collegename=" + collegename + "]";
  //}
        public Student(String name,long aadharno,String address,long phno, int rollno, String collegename) {
        	super(name,aadharno,address,phno, phno);
        	//TODO Auto-generated constructor
        	this.rollno=rollno;
        	this.collegename=collegename;
        }
        public int getrollno() {
        	return rollno;
        }
        public void setrollno(int rollno) {
        	this.rollno = rollno;
        }
        public String getcollegename() {
        	return collegename;
        }
        public void setcollegename(String collegename) {
        	this.collegename = collegename;
        	}
        
        
        
}
        