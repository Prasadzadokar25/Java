/* Method element in LinkedList
 */

import java.util.*;

class LinkedListDemo1 {

	public static void main(String args[]) {

		LinkedList ll = new LinkedList();

		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);

		System.out.println(ll);

		// add(int,object)
		ll.add(2,25);

		System.out.println(ll);

		// getFrist()
		System.out.println(ll.getFirst());
		System.out.println();

		// getLast()
		System.out.println(ll.getLast());
		System.out.println();

		//removeFirst()
		System.out.println(ll.removeFirst());
		System.out.println();

		//removeLast()
		System.out.println(ll.removeLast());
		System.out.println();
	}
}
