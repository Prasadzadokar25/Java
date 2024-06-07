// Concept => constructor is use to initialise non-static global variable


class ConstructorDemo1 {
	
	int x = 10;           // x is initialise in constructor
	static int y = 320;   // y does not initialise in constructor

	public static void main(String args []) {
		
		// System.out.println (x);   error : becouse x is in constructor and constructor come affter the static things and when objrct is created  
		System.out.println (y);

		ConstructorDemo1 obj = new ConstructorDemo1(); // here when we cretat the object constructor get callled atomaticaly and 
							       // all non static global variable get initialised
		System.out.println(obj.x);
		System.out.println(obj.z);
	
	}
	int z = 30;    // global variable can be initilise any where outside the method
}
