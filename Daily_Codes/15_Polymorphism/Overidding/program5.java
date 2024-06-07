// data types of methods in overriding should be same or should have parent child relation
class Parent5 {

   	Object fun (){

		System.out.println("in child fun");

		return 0;
	}

	int run() {

		System.out.println("in parent run");

		return 0;
	}
}	

class Child5 extends Parent5 {

	String fun(){  // String is child of Object class

		System.out.println("in child fun");

		return "ok";
	}

	/* String run() {    // error : String is not compatiable with int

		Syetm.out.println("in child fun");
	}*/


}

class OveridingDemo5 {

	public static void main(String args[]){

		Parent5 obj = new Child5();
	        obj.fun();

		
	}
}

