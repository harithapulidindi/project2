package com.tnsif.inheritanceprogram;

 class Parent {
              int var=100;
}

  public class superdemo extends Parent {
	  int var=50;
	  void display() {
            System.out.println("the child value is"+var);
		    System.out.println("the child value is"+super.var);
		    
	  }
	  
  public static void main(String[]agrs) {
	  //TODO Auto-generated method stub
	  
	  superdemo ob=new superdemo();
	  ob.display();
	  
  }
	  
  }
	  
  
