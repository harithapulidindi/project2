package com.tns.stream;
import java.util.Arrays;

import java.util.List;
import java.util.stream.collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer[] values=new Integer[] {2,5,6,8,9};
       java.util.stream.Stream<Integer> stream=Arrays.stream(values);
       //map function
       System.out.println("square of no"+Arrays.toString(values));
       Stream.map(num->num*num).forEach(System.out::println);
       //limit returns first 2 elements
       System.out.println("first 2 elements");
       Arrays.stream(values).limit(2).forEach(System.out::println);
       //limit skip list 2 elements
       System.out.println("skip first 2 elements");
       Arrays.stream(values).skip(2).forEach(System.out::println);
       //distinct elements
     List<Integer>list=Arrays.asList(1,1,2,2,3,4,5,6);
     System.out.println("distinct elements");
     list.stream().distinct().forEach(System.out::println);
     //distinct count
     long c=list.stream().distinct().count();
     System.out.println("count distance elements");
     System.out.println(c);
     //uppercase conversation
     List<String>letters=Arrays.asList("Haritha","Nandu","Yogitha");
     Stream<String>stream1=(com.tns.stream.Stream<String>) letters.stream();
     System.out.println("to uppercase");
     List<String>s1=stream1.map(str->str.touppercase()).collect(collectors.tolist());
     System.out.println(s1);
     //filter operation
     List<Integer>s2=Arrays.asList(1,2,3,4,5,6,7,8,9);
     System.out.println("filter odd numbers");
     s2.stream().filter(num->num%2==1).forEach(System.out::println);
     
	}  
}	


