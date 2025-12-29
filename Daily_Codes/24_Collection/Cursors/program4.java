/* Removing Specific element of collection using Cursor
 */

import java.util.*;

class CursorDemo4 {
	
	public static void main(String [] args) {

		ArrayList al = new ArrayList();

		al.add("prasad");
		al.add("om");
		al.add("hariom");
		al.add("ankush");

		System.out.println(al);

		Iterator itr = al.iterator();

		while( itr.hasNext()){

			if("om".equals(itr.next()))
				itr.remove();
		}
		System.out.println(al);
	}
}
