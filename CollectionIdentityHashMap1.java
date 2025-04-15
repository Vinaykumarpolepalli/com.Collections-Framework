package com.Collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class CollectionIdentityHashMap1 {

	public static void main(String[] args) {
		// Map<Object,Object> map = new HashMap<>();
		Map<Object, Object> map = new IdentityHashMap<>();
		// String Literate
//       String s1 = "java";
//       String s2= "java";

		// String Object
		String s1 = new String("java");
		String s2 = new String("java");

		map.put(s1, "is Difficult :");
		map.put(s2, " is simple");

		System.out.println(map);
	}

}
