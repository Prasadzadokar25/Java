/* non-static content can nat be acess from static content without creating object
 */


class StaticDemo6 {

	static int x = 10;
	int y = 20;

	static void fun() {

		System.out.println(x);
		// System.out.println(y);  error : non-static variable  can not be acess from static content
	}

	void gun() {

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String args [] ){

		fun();
		// gun();     error :  non-static method gun can not be acess from static content

		StaticDemo6 obj = new StaticDemo6();
		obj.gun();
	}
}

