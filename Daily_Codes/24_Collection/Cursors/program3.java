 b/* ListIterator
 *
 *  ListIterator = It can travel in both diresction
 */
import java.util.*;

class ListIteratorDemo3 {
	
	public static void main(String [] args) {

		ArrayList al = new ArrayList();

		al.add("prasad");
		al.add("om");
		al.add("abhi");
		al.add("soham");

		ListIterator ltir = al.listIterator();

		while(ltir.hasNext()) {

			System.out.println(ltir.next());
			
		}
		while(ltir.hasPrevious()){

			System.out.println(ltir.previous());
		}

		System.out.println("***Iterator***");

		Iterator corsor = al.iterator();

		while(corsor.hasNext()) {

			System.out.println(corsor.next());
		}


	}
}
