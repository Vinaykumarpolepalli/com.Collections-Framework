package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsCountWord1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();

		        String[] words = s.split(" ");
		        Map<String, Integer>m = new HashMap<>();

		        for (String word : words) {
		            if (m.containsKey(word)) {
		                m.put(word, m.get(word) + 1);
		            } else {
		                m.put(word, 1);
		            }
		        }

		      System.out.println(m);
		    
		

	}

}
