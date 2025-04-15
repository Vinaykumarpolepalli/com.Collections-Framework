package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//input: Java is simple
//Output: j=1 ,a=2,v=1,i=2;s=2,m=1,p=1,i=1,e=1
import java.util.Set;

public class CollectionCountWord2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s =sc.nextLine();
		
		Map<Character,Integer> m = new HashMap<>();
	    char[] c= s.toCharArray();
	    
	    for (char c1:c) {
	    	if(m.containsKey(c1)) {
	    	m.put(c1,m.get(c1)+1);
	    		
	    	}else {
	    		m.put(c1,1);
	    	}
	    }
	  
	 
	    System.out.println(c);
	    System.out.println(m);
	    
	    
	    Set<Entry<Character,Integer>> e = m.entrySet();
	    for(Entry<Character,Integer> entry : e) {
	    	System.out.println(entry.getKey()+ ": "+ entry.getValue());
	    	
	    }
	   
		
	}

}
