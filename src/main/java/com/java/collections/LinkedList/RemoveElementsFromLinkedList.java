package com.java.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//How to remove the first element in the linkedlist
//How to remove the last element in the linkedlist
//How to remove the first occurrence of a given element in the liked list
//How to clear the likedlist completely
public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		fruits.removeFirst();
		//System.out.println(fruits);
		
		
		//fruits.removeAll(fruits);
		//System.out.println(fruits);
		
		//iterator
		Iterator<String> iterator=fruits.iterator();
		
		//forEach
		
		fruits.forEach((element)->{System.out.println(element);});
		
		//foreach advanced loop
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		
	}

}
