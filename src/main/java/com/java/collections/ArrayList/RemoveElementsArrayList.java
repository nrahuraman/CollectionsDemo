package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

//remove()
//removeAll()
//clear()
public class RemoveElementsArrayList {

	public static void main(String[] args) {
	List<String> fruits=new ArrayList<String>();
	
	fruits.add("Banana");
	fruits.add("apple");
	fruits.add("Mango");
	fruits.add("Oragne");
	fruits.add("Pineapple");
	
	fruits.remove(2);
	//fruits.removeAll(fruits);
	System.out.println(fruits);
	}

}
