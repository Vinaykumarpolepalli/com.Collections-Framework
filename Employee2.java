package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee2 {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		
		Employee e1 = new Employee(1,"Vinay",100000,22,914311647L);
		Employee e2 = new Employee(2,"Guru",100000,22,914311647L);
		Employee e3 = new Employee(3,"Ram",1200000,22,914311647L);
		Employee e4 = new Employee(4,"Vinay",1300000,22,914311647L);
		Employee e5 = new Employee(5,"Vinay",1400000,22,914311647L);
		Employee e6 = new Employee(6,"Vinay",780000,22,914311647L);
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		
//		Comparator <Employee> cmp= new Comparator<>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return 0;
//			}
//			
//		}
//		
//		//Collections.sort(emplist);
		
		Iterator itr = emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
