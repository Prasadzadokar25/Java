/* concept = If two or more static blocks are in a class then they are executed in order and then main method executed
 */

class StaticDemo8 {

	static {

		System.out.println("In Static block 1");

	}
	public static void main(String args[] ){

		System.out.println("In main");
	}
	static {

		System.out.println("In static block 2 ");
	}
}
