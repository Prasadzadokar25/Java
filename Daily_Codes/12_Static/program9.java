/* Concept = we can not acess instant variable from the static block becouse at the time of 
 *           pusing stack fream of static block instant variable is not initilized
 */

class StaticDemo9 {

	static int x = 50;
	int y = 100;

	static {

		System.out.println(x);
		// System.out.println(y);  error : non-static variable y cannot be referenced from a static context

	}
	public static void main(String args[] ){

		

	}
}
