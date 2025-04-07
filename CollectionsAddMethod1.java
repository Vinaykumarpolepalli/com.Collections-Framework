package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsAddMethod1 {

	public static void main(String[] args) {
       Collection <Integer> c = new ArrayList<>();
       c.add(10);
       c.add(300);
       c.add(400);
       c.add(500);
       c.add(20);
       System.out.println(c);
       
       Collection <Object> c1 = new  ArrayList<>();
       
       c1.add(21);
       c1.add("vinay");
       c1.add(20);
       c1.add("Pavan");
      System.out.println(c1);
       
       Collection <Object> call = new ArrayList<>();
       call.addAll(c);
       call.addAll(c1);
       System.out.println(call);
       
       c1.clear();
       System.out.println(c1);
       
       c.clear();
       System.out.println(c);
       System.out.println();
       System.out.println(c1.contains("vinay"));
       
       
       
	}

}
