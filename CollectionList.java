package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(23);
		l1.add(45);
		l1.add(19);
		l1.add(95);
		l1.add(30);

		l1.add(1, 100);
		l1.add(5, 2000);
		System.out.println(l1);
		
		
		List<Integer> li1 = new ArrayList<>();
		li1.add(1);
		li1.add(2);
	    li1.addAll(1,l1);
	    System.out.println(li1);
	    
		List<Integer> l2 = new ArrayList<>();
		//Constructs an empty list with an initial capacity of ten.
		 l2.add(12);
		 l2.add(25);
		 l2.add(4, 100);
		 System.out.println(l2);//java.lang.IndexOutOfBoundsException
		
		 
		 
	    

	}

}
