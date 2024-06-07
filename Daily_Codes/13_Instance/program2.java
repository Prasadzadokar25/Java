/* Concept = Instatnt method 
 */

class InstantDemo2 {

	int x = 50;
	static int y = 100;

	void fun() {  //Instant method 

		System.out.println(x); // from non-Static context we can direct acess the instatnt variable 
		System.out.println(y);
		
	}
	public static void main(String args[]){

		InstantDemo2 obj = new InstantDemo2();
		obj.fun();
	}
}
