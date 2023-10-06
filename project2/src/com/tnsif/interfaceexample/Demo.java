package com.tnsif.interfaceexample;

import interfaceexample.interfaceone;

//Multiple inheritance acheived by interface
public class Demo implements ChildInterface,interfaceone
{

	
	public void print() {
		//TODO Auto-generated method stub
		System.out.println("print method");
	}
	
	
	public void show() {
		//TODO Auto-generated method stub
		System.out.println("show method");
		
	}
	
}
