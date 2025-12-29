/* Method of Deque class
 */

import java.util.*;

class DQueueDemo1 {

	public static void main(String args[]){

		Deque dq = new LinkedList();

		dq.offer(30);
		dq.offer(10);
		dq.offer(40);
		dq.offer(20);
		dq.offer(50);

		System.out.println("dq = "+dq);

		//offerFirst
		dq.offerFirst(5);
		System.out.println("offerFirst = " +dq);

		//offerLast
		dq.offerLast(60);
		System.out.println("offerLast = " +dq);

		//pollFirst
		dq.pollFirst();
		System.out.println("pollFirst = " +dq);

		//pollLast
		dq.pollLast();
		System.out.println("pollLast = " +dq);

		//peekLast
                dq.peekLast();
                System.out.println("peekLast = "+dq);

		//peekLast
                dq.peekLast();
                System.out.println("peekLast = "+dq);

		//iterator
		Iterator itr = dq.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		//descendingIterator
		Iterator itr2 = dq.descendingIterator();
		 while(itr2.hasNext()){

                        System.out.println(itr2.next());
                }
	}
}
