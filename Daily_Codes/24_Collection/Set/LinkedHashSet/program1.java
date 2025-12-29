/* LinkedHashSet = LinkedHashset maintain the order of insertion
 */



import java.util.*;

class LinkedHashSetDemo1 {

	public static void main(String args[]) {

		LinkedHashSet lhs1 = new LinkedHashSet();

		lhs1.add("kanha");
		lhs1.add("rahul");
		lhs1.add("ashish");
		lhs1.add("badhe");
		lhs1.add("ashish");
		lhs1.add("rahul");

		System.out.println(lhs1);

		LinkedHashSet lhs2 = new LinkedHashSet();

		lhs2.add(10);
                lhs2.add(20);
                lhs2.add(30);
                lhs2.add(40);
                lhs2.add(10);
                lhs2.add(20);

		System.out.println(lhs2);

	}
}

