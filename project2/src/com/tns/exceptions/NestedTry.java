package com.tns.exceptions;
//program to demonstrate nested try block
public class NestedTry {
	public static void check() {
     String str="tns";
     int slength=str.length();
     System.out.println("the length is"+slength);//exception arises
     String anotherString="hello";
     int y=6;
     try {//outertry
        int z=y/0;//exception occured
     try {//inner try
    	 System.out.println(str.charAt(y));
    }
    catch(StringIndexOutOfBoundsException ex) {  //inner catch
    	System.out.println("Arithmatic exception"+ex.getMessage());
    }
}
    catch( ArithmeticException ex) { //inner catch
    	System.out.println("Arthmetic exception"+ex.getMessage());
    }	
	}
	}
	
	
	
	
	
	
	