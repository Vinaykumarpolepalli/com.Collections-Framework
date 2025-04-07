package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList4SubList{

	public static void main(String[] args) {
		List<String> veg = new ArrayList<>();
		veg.add("Tomaota");
		veg.add("Potato");
		veg.add("Carrot");
		veg.add("Drumstick");
		veg.add("Brinjal");
		veg.add("Banana");
		
		List vegissubList =  veg.subList(2, 5);
		System.out.println(vegissubList);
	}

}
