package com.tns.Collection;

public class WrapperDemo {

	public static void main(String[] args) {
		// Wrapping
		int a=10;//primitive
		Integer i= new Integer(a);//to object type integer"+i);
		System.out.println("i is a object of type integer"+i);
		//unwrapping
		int unwrap=i.intValue();
	}
	
}



