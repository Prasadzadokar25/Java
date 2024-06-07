/* Concept = static variable can be acess from any where(ie. from Static and non-static content)
 */


class StaticDemo2 {

	static int num1 = 50;

	void fun () {

		int mul = num1*10;                //acessing static variable from non static content
		System.out.println(num1 +  " * 10 = "+mul);

	}
	public static void main(String args[] ){

		StaticDemo2 obj =new StaticDemo2();
		obj.fun();

		int mul = num1*20;       //acessing static varible from static content
		System.out.println(num1 +" * 20 = "+mul);



	}
}
