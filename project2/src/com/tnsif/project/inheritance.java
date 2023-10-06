package com.tnsif.project;


class parent {
   int var=100;
}
  public class parent extends child{
	  int var=50;
	  void display() {
		  System.out.println("the child value is"+var);
		  System.out.println("the child value is"+super,var);
	  }
	  public static void main(string[]args) {
		  superdemo ob=new superdemo();
		  ob.display();
	  }
  }
	  }
  }