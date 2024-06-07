/* Concept = calling two or more constructor by one object
 *           calling object with 'this'
 */

class ConstructorDemo8 {

	ConstructorDemo8() {

		System.out.println("In constructor 1");
	}

	ConstructorDemo8(int x ){

		this();   // this line call the no argument constructor
		System.out.println("In constructor 2 ");
	}
	ConstructorDemo8(int x,int y) {

		this(10);      // this line call the constructor having intiger parameter
	
		System.out.println("In Constructor 3 ");

	}
	public static void main(String args[] ){

		ConstructorDemo8 obj = new ConstructorDemo8(1,2);
	}
}
