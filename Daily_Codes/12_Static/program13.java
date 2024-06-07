/* concept = creating object in static block
 */


class StaticDemo13 {

	StaticDemo13() {

		System.out.println("In constructor");
	}
	static {

		System.out.println("In static block");

		StaticDemo13 obj = new StaticDemo13();   // we can call the constructor from here
		
	}

	public static void main(String [] args) {

		System.out.println("In Main");
	}
}
