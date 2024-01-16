package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

//How to check if an ArrayList is empty using the isEmpty() method
//How to find the size of an ArrayList using the size() method.
//How to access the element at a particular index in an ArrayList using the get() method.
//How to modify the element at particular index in an ArrayList using the set() method.




public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		
		List<String> topProgrammingLanguage=new ArrayList<String>();
		
		topProgrammingLanguage.add("Java");
		topProgrammingLanguage.add("Python");
		topProgrammingLanguage.add("c++");
		
		
		System.out.println(topProgrammingLanguage.isEmpty() +"this is size"+ topProgrammingLanguage.size() );
		
		String bestProgrammingLang = topProgrammingLanguage.get(1);
		System.out.println(bestProgrammingLang);
		
		
	}

}
