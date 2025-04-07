package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorMethod4 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(100);
		c1.add(200);
		c1.add(300);
		c1.add(400);
		c1.add(500);
		c1.add(1000);
		c1.add(300);
		c1.add(null);
		c1.add(null);
		c1.add(1000);

		Object[] arrayobject = c1.toArray();
		
		for(Object o : arrayobject) {
			System.out.println(o);
		}
		System.out.println("*****************************");


		int[] n = { 10, 20, 203, 40 };
		String s = "Vinay";
		System.out.println(n.length);
		System.out.println(s.length());
		System.out.println(c1.size());

		c1.remove(1000);
		c1.remove(null);
		// Iterating using Iterator
		Iterator<Integer> i = c1.iterator();

		// Returns true if the iteration has more elements
		while (i.hasNext()) {

			// Return the next element in the Iteration
			System.out.println(i.next());
			// i.remove();
		}
		// System.out.println(c1);

//Iterating using for Each loop
//for (Integer i1 : c1) {
//			System.out.println(i1);
//			
//		}
	}

}
