package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String args[])
	{
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(10,"Ramesh",30, 400000));
		employees.add(new Employee(20,"Santosh",29, 3500000));
		employees.add(new Employee(30,"Sanjay",45, 450000));
		
		
		Collections.sort(employees,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return (int) (o1.getSalary() - o2.getSalary());
				
			}
		});
		
		Collections.sort(employees,(o1,o2)->(int)(o1.getName().compareTo(o2.getName())));
		
	//	Collections.sort(employees,(o1,o2)->(int)(o2.getSalary() -o1.getSalary()));
		System.out.println(employees);
	}

}

//comparying own logic needs to be implemented
class MySort implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1,  Employee o2)
	{
		//Ascending Order
		//return (int) (o1.getSalary() - o2.getSalary());
		//Decending Order
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
}
