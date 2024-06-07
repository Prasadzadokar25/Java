// methods in the interface does naot have bodys

interface InterfaceDemo1 {

	void fun();
	void gun();
}
abstract class Child1 implements InterfaceDemo1 {

	public void fun(){

		System.out.println("in Client fun");
	}
}
class Child2 extends Child1 {

	public void gun(){

		System.out.println("in client gun");
	}
}
class Client {

	public static void main(String args[]){

		InterfaceDemo1 obj =  new Child2();

		obj.fun();
		obj.gun();

	}
}
