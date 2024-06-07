/* Concept = Instant Block 
 *
 * flow: super
 * 	 instant variable
 * 	 instant block
 * 	 remening code in constructer
 */





class InstantDemo3 {
	
	int x = 10;

	InstantDemo3() {

		System.out.println("In constructor ");

	}
	{
		System.out.println ("In Instant block");
	}

	public static void main(String args[] ) {

		System.out.println("In main ");
		InstantDemo3 obj = new InstantDemo3();
	}
}
