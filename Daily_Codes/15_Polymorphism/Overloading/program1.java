/* Overloading = same mathod name but different parameter
 */


class OverloadingDemo1 {

	void fun () {
		  
		System.out.println("Fun with no arguments ");
	}
	void fun (int x) {

                System.out.println("Fun with int ");
        }
	 void fun (int x,int y) {

                System.out.println("Fun with two int ");
        }
	void fun (float x) {

                System.out.println("Fun with float ");
        }
	void fun (OverloadingDemo1 xyz) {

                System.out.println("Fun with object ");
        }
	public static void main(String args [] ) {

		OverloadingDemo1 obj1 = new OverloadingDemo1();

		obj1.fun();
		obj1.fun(10);
		obj1.fun(10,20);
		obj1.fun(10.1f);

		OverloadingDemo1 obj2 = new OverloadingDemo1();

		obj2.fun(obj1);
	}
}
