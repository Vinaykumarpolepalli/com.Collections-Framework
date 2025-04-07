package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionsContainsMethods2 {

	public static void main(String[] args) {
       
		
		Collection<String> boys = new ArrayList<>();
		boys.add("vinay");
		boys.add("Guru");
		boys.add("Rakesh");
		boys.add("Naveen");
		boys.add("vinay");
		boys.add("Guru");
		boys.add("Rakesh");
		boys.add("Naveen");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to Search");
		String name =sc.nextLine();
		
//		System.out.println(boys.contains("vinay"));
//		System.out.println(boys.contains("pavan"));
//		
		
		if(boys.contains(name)) {
			System.out.println(name+" is Availabe in the Collection");
		}else {
			System.out.println(name+ " Not Available in the Collection");
		}
		sc.close();
	}

}
