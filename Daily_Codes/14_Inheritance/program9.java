/* Concept = Parent referance and child object
 */

class Parent9 {

        Parent9() {

                System.out.println("In Parent");
        }
}
class AChild9 extends Parent9 {

        AChild9 () {

                System.out.println("In child1");
        }
}
class BChild9 extends Parent9 {

        BChild9() {

                System.out.println("In child2");
        }
}
class Client9 {

        public static void main(String [] args ) {

		Parent9 obj1 = new Parent9();

                Parent9 obj2 = new AChild9();  // parent referance and child object
                Parent9 obj3 = new BChild9();

		AChild9 obj4 = new AChild9();
		BChild9 obj5 = new BChild9();

		// AChild9 obj6 = new Parent9(); error : 
        }
}
