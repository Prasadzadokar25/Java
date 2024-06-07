/* Concept = we can not acess the child class 
 * 	     functions from parent class
 */


class Parent3 {

        void property () {

                System.out.println("10 lack");
        }
}
class Child3 extends Parent3 {

        void marrege() {         

                System.out.println("Love marrege");
        }
}
class Client3 {

        public static void main(String args[]){

                Parent3 obj1 = new Parent3();
                // obj1.marrege();  error : symboll not found
	}
}
