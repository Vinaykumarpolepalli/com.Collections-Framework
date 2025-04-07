package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionHashcodeMethods3 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("Apple");
		c1.add("Banana");
		System.out.println(c1.hashCode());
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("Apple");
		System.out.println(c1.equals(c2));
		System.out.println(c2.hashCode());
		
		if(c1.isEmpty()) {
		System.out.println("c1 is not Empty!!");
		}else {
			c1.add("Orange");
		}
		System.out.println(c1);
	}

}
