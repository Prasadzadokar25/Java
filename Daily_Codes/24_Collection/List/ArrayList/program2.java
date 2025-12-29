/* For each loop and for loop on ArrayList
 

   Note = Try to use cursor instend of loop to access the element from the arrayList
*/


import java.util.*;

class ArrayListDemo2 {

	public static void main(String [] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add("prasad");
		al.add(20.5f);

		System.out.println("*** for each loop using Object ***");

		for (Object obj:al){             /* Here we use Object because a data to be print may be in 
						    different type*/
			System.out.println(obj);
		}

		System.out.println("\n*** for loop ***"); 

		for(int i = 0;i<al.size();i++){

			System.out.println(al.get(i));
		}

		System.out.println("\n *** for each loop using var ***");

		for (var obj:al){             /* Here we use var because a data to be print may be in
                                                  different type*/
                        System.out.println(obj);
                }


	}
}		
