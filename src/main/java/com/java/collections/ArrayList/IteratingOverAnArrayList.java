package com.java.collections.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverAnArrayList {

	public static void main(String[] args) {
		
		
		List<String> courses=Arrays.asList("c","java","spring","Hibernate");
		
		for(int i=0; i< courses.size();i++)
		{
			System.out.println(courses.get(i));
			
		}
		
		for(String course: courses)
		{
			System.out.println(course);
		}
		
		//Basic loop with iterator
		
		for(Iterator iterator=courses.iterator(); iterator.hasNext();) {
			String course=(String) iterator.next();
			
		}
		
		Iterator<String> iterator=courses.iterator();
		
		while(iterator.hasNext())
		{
			String course =(String) iterator.next();
			System.out.println(course);
		}
		
		//java 8 stream + lambda example
		courses.stream().forEach(course -> System.out.println(course));

		//java 8 forEach + lambda
		courses.forEach((course)->System.out.println(course));
	}

}
