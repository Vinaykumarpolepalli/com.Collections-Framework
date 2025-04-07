package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList2 {

	public static void main(String[] args) {
		List<String> l2 = new ArrayList<>();
		l2.add("J2SE");
		l2.add("J2EE");
	System.out.println(l2.remove("J2EE"));
		System.out.println(l2);
		
	
		//Get Method
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.remove(l1.indexOf(2));
		
		
		//l1.remove(1);//java.lang.IndexOutOfBoundsException
	  //  System.out.println(l1.get(1));
	 //   System.out.println(l1.set(1, 45));
	    
	    System.out.println(l1);//1 45

	}

}
