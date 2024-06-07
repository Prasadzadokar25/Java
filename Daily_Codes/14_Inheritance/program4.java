/* Concept = static block of parent class execute before the static block 
 * of child class because static variable of parent class need to initialize first
 *
 */


class Parent4 {

	static int x = 10;

	static {

		x = 20;
	}
}
class Child4 extends Parent4{

	static int y = 10;
	static {
		int z = x + y;
		System.out.println(z);
	}
	public static void main (String args[]){

	}
}
