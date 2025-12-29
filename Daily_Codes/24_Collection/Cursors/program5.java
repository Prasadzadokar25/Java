/* Cursor on vector
 */

import java.util.*;

class CursorDemo5 {

	public static void main (String [] args) {

		Vector v = new Vector();

		v.addElement("prasad");
		v.addElement("om");
		v.add("hariom");

		Enumeration itr = v.elements();

		while(itr.hasMoreElements()){
			System.out.println(itr.nextElement());
		}
	}
}
