/* hashset = hashset is the collection which does not allow dublicate data entry
 * 	 it can not mentain the order of insertion
 */


import java.util.*;

class HashSetDemo1 {

	public static void main(String args[]) {

		HashSet hs1 = new HashSet();
		
		hs1.add("kanha");
		hs1.add("rahul");
		hs1.add("ashish");
		hs1.add("badhe");
		hs1.add("ashish");
		hs1.add("rahul");

		System.out.println(hs1);

		HashSet hs2 = new HashSet();

		hs2.add(10);
                hs2.add(20);
                hs2.add(30);
                hs2.add(40);
                hs2.add(10);
                hs2.add(20);

		System.out.println(hs2);

	}
}
