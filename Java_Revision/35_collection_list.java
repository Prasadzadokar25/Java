import java.util.List;
import java.util.ArrayList;

class Client{

	public static void main(String[] args){

		List ar = new ArrayList();

		System.out.println(ar.size());

		ar.add(10);
		ar.add("prasad");

		 System.out.println(ar.size());
		 System.out.println(ar.toArray()[1]);
	}
}
