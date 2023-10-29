package com.tns.stream;


import java.util.Arrays;
import java.util.List;

public class FilterOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> s1=Arrays.asList(1,1,2,2,3,3,4,5,6,7,8,9);
  System.out.println("filter the odd numbers");
  s1.stream().filter(val->val%2==1).forEach(System.out::println);
  }

}
