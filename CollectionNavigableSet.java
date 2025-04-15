package com.Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionNavigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> n = new TreeSet<>();
		n.add(200);
		n.add(300);
		n.add(50000);
		n.add(3000);
		n.add(800);
		n.add(500);
		n.add(900);
		n.add(1000);
		
		System.out.println(n);
		System.out.println(n.floor(300));
       //Returns the greatest element in this set less than or equal tothe given element, 
	   //or null if there is no such element.
		System.out.println(n.ceiling(800));
         //Returns the least element in this set greater than or equal tothe given element,
		//or null if there is no such element.

		System.out.println(n.higher(500));
		//Returns the least element in this set strictly greater than thegiven element,
		//or null if there is no such element.
		System.out.println(n.lower(900));
		//Returns the greatest element in this set strictly less than thegiven element, 
		//or null if there is no such element.
		System.out.println(n.pollFirst());
		//Retrieves and removes the first (lowest) element,or returns null if this set is empty.
		System.out.println(n.pollLast());
        //Retrieves and removes the last (highest) element,or returns null if this set is empty.

		

		}

}
