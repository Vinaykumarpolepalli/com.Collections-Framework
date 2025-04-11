package com.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection1 {

	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<>();
		List <Integer> a =  new CopyOnWriteArrayList<>();
		a.add(10);
		a.add(3);
		a.add(300);
		a.add(400);
		a.add(30);
		
		
		Iterator <Integer>  it  = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			a.add(40);
		}
		
//		for(Integer i : a) {
//			System.out.println(i);
//			a.add(30);
//			
//		}
//		
		
		
//		for(int i =0 ;i<a.size();i++) {
//			System.out.println(a.get(i));
//			a.add(60);
//		}
		System.out.println(a);
	}

}
