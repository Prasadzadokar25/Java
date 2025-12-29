/* vector
 */

import java.util.*;

class VectorDemo1 {

	public static void main(String [] args ) {

		Vector v = new Vector();

		v.add(10);  			// this is the common method to all class's in list
		v.addElement(20);   		// this is special method of vector class
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

		System.out.println(v.capacity());  // default capacity is 10

		}
}
