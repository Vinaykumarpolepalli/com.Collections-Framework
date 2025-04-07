package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class CollectionArrayList1 {

	public static void main(String[] args) {
	List<Integer> a1 = new LinkedList<>();
	//List<Integer>  a1= new ArrayList<>();//  Capacity  10  15 22 33 49  half values 
 		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add(20);
		a1.add(40);
		a1.add(400);
		a1.add(null);
		a1.add(null);
		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add(20);
		a1.add(40);
		a1.add(400);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.size());
		

	}

}
