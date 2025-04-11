package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSortedset {

	public static void main(String[] args) {
//		SortedSet <Employee>em = new TreeSet<>();
//		Employee e1 = new Employee(1,"Vinay",100000,22,914311647L);
//		Employee e2 = new Employee(2,"Guru",100000,22,914311647L);
//		Employee e3 = new Employee(3,"Ram",1200000,22,914311647L);
//		Employee e4 = new Employee(4,"Vinay",1300000,22,914311647L);
//		Employee e5 = new Employee(5,"Vinay",1400000,22,914311647L);
//		Employee e6 = new Employee(6,"Vinay",780000,22,914311647L);
//		em.add(e1);
//		em.add(e2);
//		em.add(e3);
//		em.add(e4);
//		em.add(e5);
//		em.add(e6);
//		System.out.println(em);
		
		SortedSet <Integer>s = new TreeSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(3);
		s.add(8);
		s.add(25);
		s.add(40);
//		s.add("Vinay");   // Sortedset is not all heterogeneous elements ( error:java.lang.ClassCastException)
//		s.add("java"); 
//		s.add("HTML");
//		s.add("CSS");
		System.out.println(s);
		System.out.println(s.first());//3
		System.out.println(s.last());//40
		System.out.println(s.subSet(20, 25)); //[20]
		System.out.println(s.tailSet(25));		//[25, 30, 40]
		System.out.println(s.headSet(30));//[3, 8, 10, 20, 25]
		System.out.println(s.reversed());
		
	}

}
