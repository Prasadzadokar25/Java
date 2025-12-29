// priorityQueue use Heap data sturcture to store the data

import java.util.*;
class PQueueDemo1 {

	public static void main(String args[]){

		PriorityQueue pq = new PriorityQueue();

		pq.offer(30);
		pq.offer(10);
		pq.offer(40);
		pq.offer(20);
		pq.offer(50);
	
		System.out.println(pq);
	}
}



