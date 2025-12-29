/* ArrayDeque method
 */

import java.util.*;

class ADequeDemo1 extends ArrayDeque {

	public static void main(String args[]) {

		ArrayDeque dq = new ArrayDeque();

		dq.offer(30);
		dq.offer(10);
		dq.offer(40);
		dq.offer(20);
		dq.offer(50);

		System.out.println(inc(10,40,10));
	}
}

