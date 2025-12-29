/* SortedSet Interface methods 
 */

import java.util.*;
class TreeSetDemo4 {

	public static void main (String args[] ) {

		SortedSet ss = new TreeSet ();

		ss.add("prasad");
		ss.add("Abhijeet");
		ss.add("Ankush");
		ss.add("Soham");
		ss.add("Om");

		System.out.println("TreeSet = " + ss);

		/* subSet : it return the sub set of give TreeSet
		 * 	    excluding the last data  */

		System.out.println (ss.subSet("Abhijeet","om"));

		/* Note : Here we not using linked list hence order of 
		 * 	  data is preserve */

		//headSet : return the all elements present before the give element
		System.out.println (ss.headSet("Om"));

		/*tailSet : return the all elements present after the given element
			    include given element also */

		System.out.println(ss.tailSet("Om"));

		// first : return firsst element of SortedSet
		System.out.println(ss.first());

		// last
		System.out.println(ss.last());


	}
}
