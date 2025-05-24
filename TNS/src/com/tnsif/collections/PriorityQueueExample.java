package com.tnsif.collections;
		import java.util.*;

		public class PriorityQueueExample {
		    public static void main(String[] args) {
		        PriorityQueue<Integer> pq = new PriorityQueue<>();

		        pq.add(40);
		        pq.add(10);
		        pq.add(30);
		        pq.add(20);

		        System.out.println("PriorityQueue (Min-Heap):");
		        while (!pq.isEmpty()) {
		            System.out.println(pq.poll());  // Retrieves and removes the head
		        }
		    }
		

	}


