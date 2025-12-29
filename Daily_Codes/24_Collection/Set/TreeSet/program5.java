/* NavigableSet Interface Methods
 */


import java.util.*;

class TreeSetDemo5 {

	public static void main(String [] args ) {

		NavigableSet ns = new TreeSet ();

		ns.add(40);
		ns.add(10);
		ns.add(30);
		ns.add(50);
		ns.add(20);

		System.out.println("TreeSet = "+ ns);
		
		/* lower : The lower() method of NavigableSet interface in Java is used
			   to return the greatest element in this set strictly less than the given element  */

		System.out.println("lower = "+ns.lower(30));
	

		/* higher :  used to return the least element in this set strictly greater than 
		 	      the given element, or null if there is no such element exists.  */

		System.out.println("higher = "+ ns.higher(25));


		/* floor : used to return the greatest element in this set less than or equal to
		 	    the given element, or null if there is no such element exists in the set. */

		System.out.println("floor = " + ns.floor(20));


		/*ceiling : used to return the least element in this set greater than or equal 
			    to the given element, or null if there is no such element */

		System.out.println("ceiling = " + ns.ceiling(30));


		//desendingSet : return the set in descending order
                System.out.println(ns.descendingSet());

		// iterator 
		System.out.println("*****iterator****");

		Iterator itr = ns.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		// descendingIterator
		System.out.println("*****descendingIterator****");

		Iterator itr2 = ns.descendingIterator();

		while(itr2.hasNext()){

                        System.out.println(itr2.next());
                }

		// subSet
		System.out.println("subSet = " + ns.subSet(20,false,40,false));

		// headSet
                System.out.println("headSet = " + ns.headSet(30,false));

		// tailSet
                System.out.println("tailSet = " + ns.tailSet(30,true));
		



		//pollFirst : return and remove the first element int he set
		System.out.println("pollFirst = " +ns.pollFirst());


		//pollLast : return and remove the last element in set
		System.out.println("pollLast = "+ ns.pollLast());

		// descendingSet : return set in decendind order
                System.out.println("descendingSet = "+ ns.descendingSet());

	}
}
