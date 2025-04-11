package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionList3RetianAll{

	public static void main(String[] args) {
		List<String> veg = new ArrayList<>();
		veg.add("Tomaota");
		veg.add("Potato");
		veg.add("Carrot");
		veg.add("Drumstick");
		veg.add("Brinjal");
		veg.add("Banana");
		
		List<String> furites  = new ArrayList<>();
		furites.add("Mango");
		furites.add("Apple");
		furites.add("Orange");
		furites.add("Pineapple");
		furites.add("Banana");
		furites.add("Tomaota");
		
		
		Collections.sort(furites);
		System.out.println(furites);
//		veg.retainAll(furites);
//		
//
//		//System.out.println(veg.get(2));
//		System.out.println("*********veg***************");
//		
//		Iterator<String> itr = veg.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		for(int i =0;i<veg.size();i++) {
//			System.out.println(veg.get(i));
//		}
//		
//		for(String veg1 : veg) {
//			System.out.println(veg1);
//		}
//		

	}

}
