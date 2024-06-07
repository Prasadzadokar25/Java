// we can not overide static method 
//
class Parent7 {

	static void fun() {

		System.out.println("In parent fun");
	}
}
class  Child7 extends Parent7 {

       	void fun () {   

		 System.out.println("In child fun");
        }
}
class OveridingDemo7 {

	public static void main(String args[]){

		Parent7 obj = new Child7();
		obj.fun();
	}
}

// error : overridden method is static
