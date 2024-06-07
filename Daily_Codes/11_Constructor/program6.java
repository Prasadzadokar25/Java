/* Concept = Hidden this reference  
 */

class ThisDemo1 {

	ThisDemo1() {

		System.out.println("costructor this"); 
		System.out.println(this);
		System.out.println();
	}

	void fun() {

		System.out.println("Method this");
                System.out.println(this);
		System.out.println();

	}

	public static void main (String args[]){

		ThisDemo1 obj = new ThisDemo1();
		obj.fun();
		
		System.out.println("address of object ");
		System.out.println(obj);
	}

}
