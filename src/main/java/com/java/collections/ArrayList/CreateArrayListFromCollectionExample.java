package com.java.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

//How to Create an ArrayList from another collection using the ArrayList using the addAll() method

//How to add all the elemetns from an existing collection to the new ArrayList(Collection c) constructor



public class CreateArrayListFromCollectionExample {

	public static void main(String[] args)
	{
		
		//create arraylist object
		
		List<Integer> firstFivePrime=new ArrayList<Integer>();
		firstFivePrime.add(2);
		firstFivePrime.add(11);
		firstFivePrime.add(3);
		firstFivePrime.add(5);
		firstFivePrime.add(7);
		
		List<Integer> firstTenPrime=new ArrayList<Integer>(firstFivePrime);
		List<Integer> nextFivePrimeNumbers=new ArrayList<Integer>();
		
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		
		firstTenPrime.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrime);
		
	}
}
