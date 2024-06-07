/* concept = object as a parameter of constructor
 */


class ConstructorDemo7 {


	ConstructorDemo7 () {

		System.out.println("No argument contruuctor ");
	}
	ConstructorDemo7 (ConstructorDemo7 xyz ) {
		

		System.out.println("In costructor with parameter object ");

	}
	public static void main (String [] args ) {

		ConstructorDemo7 obj1 = new ConstructorDemo7();
		ConstructorDemo7 obj2 = new ConstructorDemo7(obj1);
	}
}
