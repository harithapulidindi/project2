package com.tnsif.abstraction;

public class Square extends Shape {
private float side;

    public square() {
    	super();
    	this.side=2.0f;
    	 }
    
    public square(float side) {
    super();
    this side=side;
    }
    
    void calArea() {
    	//TODO Auto-generated method stub
    	super.area=side*side;
    	
    }
    

    public String toString() {
    	return "Square[side="+side+"]";
    }
    
  
}
