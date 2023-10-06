package com.tnsif.abstraction;
//program to demonstrate abstract
public abstract class Shape {
	protected float area;
	//abstract
	abstract void calArea();
	void show() {
	  System.out.println("area of shape"+area);
	}
	
}
