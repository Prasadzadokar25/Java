/* Iterator 
 *
 * Iterator = Iterator travels on our collection
 */

import java.util.*;

class IteratorDemo1 {

	public static void main(String [] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("Prasad");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}
}
