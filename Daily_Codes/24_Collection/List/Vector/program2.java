/* Creating vector collection with user define capcity
 */


import java.util.*;

class VectorDemo2 {

	public static void main (String args[] ){

		Vector v1 = new Vector(2);  // It create a vector with given capacity

		System.out.println("Capacity v1 = " + v1.capacity());

		v1.add(10);         // common method of List Interface to add element in collection [ ArrayList,LinkedList,Vector]
		v1.addElement(20);  // special method of vector class to add elemrnt in vector
		v1.addElement(30);

		System.out.println("Size v1 = " + v1.size());	  /* It print number which represent how many elements
						     		     are present in vector */

		System.out.println("New Capacity v1 = " + v1.capacity());   // new capccity = 2 * old capacity



		Vector v2 = new Vector(1,10);  /* This constructor create create vectoy with cpacity 1
					          if capcity get full increse capcity by 10 ie.new capcity = 10 + 1 */

		System.out.println("Capacity v2 = " + v2.capacity());

		v2.add(10);
		v2.addElement("prasad");

		System.out.println("New Capacity v2 = " + v2.capacity());


	}
}

