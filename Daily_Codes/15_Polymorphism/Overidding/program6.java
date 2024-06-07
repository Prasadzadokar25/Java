// access specifier in overiding
// overide method should have same or greater access specifire

class Parent6 {

	public void fun() {

		System.out.println("In parent fun");
	}
}
class Child6 {

       	void fun () {   // default has bigger scope than public

		 System.out.println("In child fun");
        }
}
class OveridingDemo6 {

	public static void main(String args[]){

		Child6 obj = new Child6();
		obj.fun();
	}
}
