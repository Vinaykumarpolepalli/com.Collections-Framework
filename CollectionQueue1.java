package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue1 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(3);
		q.add(4);
		q.add(50);
		q.remove();//NoSuchElementException when the Queue is Empty
		System.out.println(q.element());//NoSuchElementException when the Queue is Empty
	
		
		
		q.offer(30);
		q.offer(3);
		q.offer(4);
		q.offer(50);
		q.poll();//The head of this Queue,or null if this Queue is Empty
		System.out.println(q.poll()); //Top of the Queue
		System.out.println(q);
	}

}
