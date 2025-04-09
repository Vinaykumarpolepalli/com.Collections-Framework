package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Mobile2 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("onePlue", "9R", 45000.00, 16);
		Mobile m2 = new Mobile("onePlue", "10T", 55000.00, 32);
		Mobile m3 = new Mobile("Iphone", "16", 145000.00, 6);
		Mobile m4 = new Mobile("Iphone ", "15", 115000.00, 4);
		Mobile m5 = new Mobile("Samsung", "S22", 45000.00, 8);
		
		List <Mobile> mobilelist= new ArrayList<>();
		
		mobilelist.add(m1);
		mobilelist.add(m2);
		mobilelist.add(m3);
		mobilelist.add(m4);
		mobilelist.add(m5);
		
		
		//Anonymous inner class implements Comparator
		Comparator <Mobile> cmp= new Comparator<>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if(o1.getPrice() < o2.getPrice()) {
					return -1;
				}else if (o1.getPrice()> o2.getPrice()) {
					return 1;
				}else {
					return 0;
				}
				
			}
		};
		
		Collections.sort(mobilelist,cmp);
		
		
		Iterator itr = mobilelist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
