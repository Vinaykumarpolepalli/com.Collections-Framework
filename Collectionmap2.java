package com.Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Collectionmap2 {

	public static void main(String[] args) {
      Map<String,String> m = new ConcurrentHashMap<>();
      m.put("J2SE", "core java");
      m.put("J2EE", "Advance java");
      m.put("Frameworks","Spring Spring boot");
      m.put("DAO","JDBC");
      System.out.println(m);
      
      Set<Entry<String,String>> e = m.entrySet();
      
      for(Entry<String,String> e1:e) {
    	  m.put("UI", "CSS ,HTML ,JS,BS,RJ,AJ");
    	  System.out.println(e1.getKey()+"-->"+e1.getValue());
    	
      }
      System.out.println(m);
      
	}

}
