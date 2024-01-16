package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionsDemo {

	public static void main(String[] args) {
		
		Collection<String> fruitCollection =new ArrayList<String>();
		
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		
		System.out.println(fruitCollection);
		
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
	}

}
