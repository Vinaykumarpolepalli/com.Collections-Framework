package com.Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionVector1 {

	public static void main(String[] args) {
		//Vector v = new Vector();
		Vector <Integer> v = new Vector<>();
		//Vector <Object> v1 = new Vector<>();
		v.addElement(10);
		v.addElement(null);
		v.addElement(20);
		v.addElement(3);
		v.addElement(null);
		v.addElement(30);
		v.addElement(10);
		v.addElement(null);
		v.addElement(20);
		v.addElement(3);
		v.addElement(null);
		v.addElement(30);
		//v.addElement("Vinay");
		
//		Collections.sort(v);
//		
//		Enumeration<Integer> en =v.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
//		
		System.out.println(v);
	}

}
