package com.java.collections.LinkedList;

import java.util.LinkedList;

//add()
//add(2,element)
//addFirst()
//addLast()
public class LinkedListExample {

	public static void main(String[] args) {
		

		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		fruits.add(2,"Watermelong");
		System.out.println("After adding watermelong=>"+fruits);
		
		fruits.addFirst("Strawberry");
		System.out.println("After adding Strawberry"+fruits);
		
		fruits.addLast("Orange");
		System.out.println("After adding organe"+fruits);
	}

}
