package com.java.collections;

import java.lang.*;

public class NeedOfCollections {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int[] arArray=new int[100000];
		
		// limitations of an array
		// 1. Arrays are fiexed in size
		// 2. Arrays can hold only homogeneous data elements
		// 3. Ready made API's support is not available in array
		
		
		Student[] students=new Student[10];
		
		Object[] objects=new Object[10];
		
		objects[0]=new Student();
		objects[1]=new Book();
		
		

	}

}

class Book
{
	
}

class Student{
	
}
