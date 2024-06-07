/* cocept = System.exit()
 *
 * 	    -This line skip the execution of the main method 
 */

class StaticDemo10 {

	static {

		System.out.println("In Static block ");
		System.exit(5);
	}
	public static void main(String [] args ){

		System.out.println("In main ");
	}
}	
