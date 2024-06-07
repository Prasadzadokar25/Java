/* concept = Hirarchical Inheritance
 */


class Parent8 {

        Parent8() {

                System.out.println("In Parent");
        }
}
class AChild8 extends Parent8 {

        AChild8 () {

                System.out.println("In child1");
        }
}
class BChild8 extends Parent8 {

        BChild8() {

                System.out.println("In child2");
        }
}
class Client8 {

        public static void main(String [] args ) {

                AChild8 obj1 = new AChild8();
		BChild8 obj2= new BChild8();
        }
}
