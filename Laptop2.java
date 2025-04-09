package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop2 {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 4, 55000.00);
		Laptop l2 = new Laptop("Asus", 8, 50000.00);
		Laptop l3 = new Laptop("Lenove", 16, 60000.00);
		Laptop l4 = new Laptop("Mac", 4, 155000.00);
		Laptop l5 = new Laptop("Hp", 8, 65000.00);

		List<Laptop> laplist = new ArrayList<>();
		laplist.add(l1);
		laplist.add(l2);
		laplist.add(l3);
		laplist.add(l4);
		laplist.add(l5);
		
		Collections.sort(laplist);
		
		for (Laptop l : laplist) {
			System.out.println(l);
		}

	}

}
