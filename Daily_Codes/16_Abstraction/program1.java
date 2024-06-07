abstract class Parent1 {

	static void fun() {

		System.out.println("In parent fun");
	}
	abstract void marry();

}
class  Child1 extends Parent1 {

       	void marry() {
		
		System.out.println(" Srusti");

	}
}
class AbstractDemo1 {

	public static void main(String args[]){

		Parent1 obj = new Child1();
		obj.fun();
		obj.marry();
	}
}

