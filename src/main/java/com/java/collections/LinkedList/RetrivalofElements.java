package com.java.collections.LinkedList;

import java.util.LinkedList;

//How to get the first element in the linked list
//How to get the last element in the linked list
//How to get the element at a given index in the LinkedList
//How to get all the elements from linkedlist




public class RetrivalofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		String firstelement =fruits.getFirst();
		String lastelement=fruits.getLast();
		String byIndex=fruits.get(2);
		
		
		
	}

}
