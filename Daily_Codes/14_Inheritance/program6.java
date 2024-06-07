/* Concept = If parent and child class have same method name then acess
 * the method of parent class with 'super'
 *
 */


class Parent6 {

        Parent6() {

                System.out.println("In Parent");
        }
	void fun() {

		System.out.println("In parent fun");
	}
}
class Child6 extends Parent6 {


        Child6() {

                System.out.println("In Child");
        }
        void fun () {

		System.out.println("In child fun");
	}

	void call(){

		fun();   // child class method
		super.fun();  // parent class method
	}

           
}
class Client6 {

        public static void main(String args[]) {

                Child6 obj = new Child6();
                obj.call();
        }
}
