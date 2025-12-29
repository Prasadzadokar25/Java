/*  getclass().getName()
 *
 *  printing class name of the element in the collection
 */

 import java.util.*;

class ArrayListDemo5 {

	public static void main(String [] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add("prasad");
		al.add(20.5f);

		for (var obj:al){

			System.out.println(obj);
			System.out.println(obj.getClass().getName());
		}
	}
}
