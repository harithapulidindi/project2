package com.tnsif.overloading;
//program to demonstrate Function overloading
public class Point {
	private float x;
	private float y;
	public Point()
	{
		x=0.0f;
		y=0.0f;
		}
        public Point(float x)
        {
        	this.x=x;
        	}
         public Point(float x,float y) {
        	 this.x=x;
        	 this.y=y;
         }
}
         
