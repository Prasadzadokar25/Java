// Method hidding
// `
class Parent8 {

	static void fun() {

		System.out.println("In parent fun");
	}
}
class  Child8 extends Parent8 {

       static void fun () {   // not the case of overide this fun consider as sepereat method of child class

		 System.out.println("In child fun");
        }
}
class OveridingDemo8 {

	public static void main(String args[]){

		Parent8 obj1 = new Parent8();
		obj1.fun();

		Child8 obj2 = new Child8();
                obj2.fun();

		Parent8 obj3 = new Child8();
                obj3.fun();
	}
}

