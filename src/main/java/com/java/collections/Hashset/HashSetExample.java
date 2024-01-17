package com.java.collections.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		//create a HashSet using te HashSet() constructor
		//add new elements to it using the add() method
		
		Set<String> programLang=new HashSet<>();
		programLang.add("C");
		programLang.add("Java");
		programLang.add("Python");
		programLang.add("Cobal");
		programLang.add("Scala");
		programLang.add("JavaScript");
		
		System.out.println(programLang);
	}

}
