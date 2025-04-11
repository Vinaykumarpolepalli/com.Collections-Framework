package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSet1 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s = new LinkedHashSet<>();
		
		s1.add(40);
		s1.add(64);
		s1.add(10);
		s1.add(20);
		System.out.println(s1);
	
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(null);
		s.add(null);
		s.add(null);
		
		System.out.println(s);
	}

}
