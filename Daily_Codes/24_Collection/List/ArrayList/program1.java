/* Methods of ArrayList
 */

import java.util.*;

class ArrayListDemo1 {
        public static void main (String [] args ) {

                ArrayList al = new ArrayList();

		//add( e ) = add element in ArrayList 

                al.add(10);
                al.add(20.5f);
                al.add("Prasad");
                al.add(10);
                al.add(20.5f);

                System.out.print(al);
		System.out.println();

		// size() method = it print the size of arraylist
		System.out.println(al.size());

		// contains( e ) = it return true if element found in arraylist
		System.out.println(al.contains(10));

		// indexOf( e ) = search element in arraylist and return its first index if element not found then return -1
		System.out.println(al.indexOf(20.5f));

		// lastIndexOf( e ) = search element in arraylist and return its last index if element not found then retur -1
		System.out.println(al.lastIndexOf(20));  // -1

		// get(int) = print the element present at index int
		System.out.println(al.get(2));

		//remove(int) = it remove the element present at index int
		System.out.println(al.remove(2));

		


        }
}
