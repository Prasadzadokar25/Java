/* concept = when we create a object of a class in anther class then its static block 
 * 	     automaticaly executed
 */

class Demo1 {

	static {
		System.out.println("static block 1");
	}
} 

class StaticDemo12 {

	 static {
                System.out.println("static block 2");
        }

	public static void main(String args[]) {

		System.out.println("In main");
		Demo1 obj = new Demo1(); // here the static block of Demo1 class is executed

	}
}
