/* Concept = Instance variable : non static global variable
 */


class InstantDemo1 {

	int x = 40;
	int y = 50;


	public static void main(String args[]) {

		InstantDemo1 obj = new InstantDemo1();  /* If we acessing instant variable from static context we 
							   compalsary need to create object of class */
		
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}


