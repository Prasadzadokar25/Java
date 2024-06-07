/* concept = Static block
 */

class StaticDemo7 {

	static {
		System.out.println("static block ");
	}
	public static void main(String args[] ){

		System.out.println("in main ");

	}
}

/* Note : stack fream of static block is pushed before the stack fream of main method
 */
