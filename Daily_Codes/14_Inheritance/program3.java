/* Concept = static in Inheritance
 */

class Parent3 {

	static {

		System.out.println("static of parent ");
	}
}
class Child3 extends Parent3 {

	static { 

		System.out.println("static of Child ");
	}
}
class Client3 {

	public static void main(String args[] ) {

		Child3 obj = new Child3();     // When we create object it atomaticaly call the constructor,instant block,static block

	}
}
