/* Concept = calling parent method even if it is overried in 
 * child class 
 */


class Parent2 {

        void marrege() {

                System.out.println("Arrange marrege");
        }
        void property () {

                System.out.println("10 lack");
        }
}
class Child2 extends Parent2 {

        void marrege() {         // overriding marrege mrthod

                System.out.println("Love marrege");
		super.marrege(); // It call the marrege method of parent class
        }
}
class Client2 {

        public static void main(String args[]){

                Child2 obj = new Child2();
                obj.marrege();

		Parent2 obj1 = new Parent2();
		obj1.marrege();   /* we creating the object of parent class hence 
				   if we call the marrege method on parent object it call the 
				   marrege method of parent class*/

        }
}
