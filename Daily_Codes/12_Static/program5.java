/* concept = static method
 */


class StaticDemo5 {

	static void fun () {

		System.out.println("prasad");

	}
	public static void main(String args[]){

		fun();   // since fun is static we can acess it directly

		StaticDemo5 obj = new StaticDemo5(); // we can also acess it with help of object
		obj.fun();
	}
}
