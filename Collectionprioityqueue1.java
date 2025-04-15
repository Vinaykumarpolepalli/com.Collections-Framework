package com.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collectionprioityqueue1 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(4);
		q.offer(5);
		q.offer(6);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q);
		
	}

}
