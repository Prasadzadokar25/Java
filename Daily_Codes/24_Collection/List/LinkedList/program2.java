/* For each loop and for loop on LinkedList
 

   Note = Try to use cursor instend of loop to access the element from the LinkedList
*/


import java.util.*;

class LinkedListDemo2 {

	public static void main(String [] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.addFirst(20);
		ll.add("prasad");
		ll.add(20.5f);

		System.out.println("*** for each loop using Object ***");

		for (Object obj:ll){             /* Here we use Object because a data to be print may be in 
						    different type*/
			System.out.println(obj);
		}

		System.out.println("\n*** for loop ***"); 

		for(int i = 0;i<ll.size();i++){

			System.out.println(ll.get(i));
		}

		System.out.println("\n *** for each loop using var ***");

		for (var obj:ll){             /* Here we use var because a data to be print may be in
                                                  different type*/
                        System.out.println(obj);
                }


	}
}
