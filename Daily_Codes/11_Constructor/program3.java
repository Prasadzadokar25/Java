// conceptr => calling constructor from the different methods

class ConstructorDemo3 {

	ConstructorDemo3 (){

		System.out.println("call to constructer");
	}
	void fun (){
		ConstructorDemo3 obj = new ConstructorDemo3();
	}
	public static void main(String args [] ){
		ConstructorDemo3 obj1  = new ConstructorDemo3();
		ConstructorDemo3 obj2 = new ConstructorDemo3();
		obj1.fun();
	}
}
