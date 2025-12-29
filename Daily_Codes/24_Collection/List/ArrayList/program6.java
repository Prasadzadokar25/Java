/* concept : sorting the dublicate data of List
 *
 * Note : 'sort' method of Collections class is use to sort dublicate 
 * 	  data of List
 */


import java.util.*;

class ArrayListDemo6 {

	public static void main(String args[]) {

		ArrayList al = new ArrayList();

		al.add("prasad");
		al.add("om");
		al.add("hariom");
		al.add("shubham");
		al.add("pappu");

		System.out.println(al);

		Collections.sort(al);   // calling static sort method od Collections class
		System.out.println(al);

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(5);
		ll.add(12);

		System.out.println(ll);

		Collections.sort(ll);
		System.out.println(ll);


	}
}
