package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collectiomap1 {

	public static void main(String[] args) {
		Map <Integer ,String> m = new HashMap<>();
		m.put(30, "Vinay");
		m.put(18, "Virat");
		m.put(7, "MSD");
		m.put(30, "kumar");//Updated
		System.out.println(m.put(21, "Guru"));//Null
		System.out.println(m.put(21, "sai"));//Guru
		
		System.out.println(m.containsKey(18));//True
		System.out.println(m.containsValue("virat"));//False Because of the virat v is small Letter 
		
		//Represent only key
		System.out.println(m.keySet());//[8, 21, 7, 30]/
		//Represent only values
		System.out.println(m.values());//[Virat, Vinay, MSD, Vinay]
		
		m.remove(30);
		
		//Represent the key and values
		Set<Entry<Integer,String>> enteries=m.entrySet();
		for(Entry<Integer,String> entry:enteries) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		Map <String,String> m1 = new HashMap<>();
		m1.put("SRH","Hyderdad");
		System.out.println(m);
		System.out.println(m1);
		
		
	}

}
