package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionListIterator {

	public static void main(String[] args) {
           List<String> l1 = new ArrayList<>();
           l1.add("J2SE");
           l1.add("J2EE");
           l1.add("DAO");
           l1.add("Frameworks");
           l1.add("UI");
           l1.add("Spring");
           l1.add("SpringBoot");
           
           //Iterator<String> itr = l1.iterator();
//           while(itr.hasNext()){
//         	  System.out.println(itr.next()); 
//            }
           
   		ListIterator<String>litr =l1.listIterator();
 
           while(litr.hasNext()){
        	  System.out.println(litr.next()); 
           }
           System.out.println("*****************");
           
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
