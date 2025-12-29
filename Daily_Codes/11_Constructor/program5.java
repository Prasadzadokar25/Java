/* Concept = parametric constructor
 */

class ConstructorDemo5 {

	ConstructorDemo5() {

		System.out.println("In no argument constructor");
	}

	ConstructorDemo5(int x) {

		System.out.println("In parametric constructor 1 ");
	}

	ConstructorDemo5(int x, int y) {

		System.out.println("In parametric constructor 2 ");

	}

	public static void main(String args[]) {

		ConstructorDemo5 obj1 = new ConstructorDemo5(); // call to no argument constructor

		ConstructorDemo5 obj2 = new ConstructorDemo5(5); // call to constructor having one parameter

		ConstructorDemo5 obj3 = new ConstructorDemo5(1, 2); // call to constructor having two parameter
	}
}
