/* Concept = Base class and Derived class
 */

class ICC {
	
	ICC () {
		System.out.println("In ICC base class");
	}
}
class BCCI extends ICC {

	BCCI (){

		System.out.println("In BCCI derived class");

	}
}
class Client1 {

	public static void main (String args[] ) {

		BCCI obj = new BCCI();
	}
}
