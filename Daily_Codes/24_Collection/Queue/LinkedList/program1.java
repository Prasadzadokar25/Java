/* LinkedList is also child of Queue Interface
 
   method of Queue
*/

import java.util.*;
class LinkedListDemo1 {

	public static void main(String args[]) {

		Queue lq = new LinkedList();

		lq.offer(20);	
		lq.offer(10);
		lq.offer(30);
		lq.offer(50);
		lq.offer(40);
	
		System.out.println(lq);

		//poll
		lq.poll();
		System.out.println("poll = "+lq);  	// This method do not give error if Queue is empty

		//remove            		// give error : NoSuchElementFound if Queue is empty
		lq.remove();
		System.out.println("remove = " +lq);

		//peek
		System.out.println("peek = " +lq.peek());  // This method do not give error if Queue is empty

		//element			// give error : NoSuchElementFound if Queue is empty
		System.out.println("elements = "+lq.element());
		
	}
}









