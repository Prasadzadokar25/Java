/* Concept = Change in a static variable in a function is applicable to all function in the class
 */


class StaticDemo4 {

	static int num = 100;

	void fun (){

		num = num + 100;                // now the value of static num becomes 200 for all functions
		System.out.println(num);
	}
	public static void main(String args[]){

		StaticDemo4 obj = new StaticDemo4();
		obj.fun();

		System.out.println(num);
	}
}


