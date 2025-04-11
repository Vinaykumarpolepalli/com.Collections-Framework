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
		System.out.println(n.ceiling(800));
		System.out.println(n.higher(500));
		System.out.println(n.lower(900));
		

		}

}
