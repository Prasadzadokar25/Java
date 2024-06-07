// methods in the interface does naot have bodys

interface InterfaceDemo1 {

	void fun();
	void gun();
}
class Client implements InterfaceDemo1 {

	public void fun(){

		System.out.println("in Client fun");
	}
	public void gun(){

		System.out.println("in client gun");
	}
	
	public static void main(String args[]){

		Client obj =  new Client();

		obj.fun();
		obj.gun();

	}
}
