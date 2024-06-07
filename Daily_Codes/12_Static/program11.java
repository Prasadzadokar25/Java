/* cocept = System.exit()
 *
 *          -This line skip the execution of the main method
 */

class StaticDemo11 {

        static {

                System.out.println("In Static block ");
                
        }
	static void fun() {

		System.out.println("In fun ");
		System.exit(2);

	}
        public static void main(String [] args ){

                System.out.println("main start ");
		fun();
		System.out.println("main end ");
        }
}
