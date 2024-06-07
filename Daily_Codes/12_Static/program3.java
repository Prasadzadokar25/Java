/*Concept = Static varible can be acess from other class using class name
 */


class Demo {

        static int x = 100;

}
class StaticDemo3 {

        public static void main(String args[] ){

              System.out.println(Demo.x);  // Acessing with class name

	      Demo obj = new Demo();
	      System.out.println(obj.x);   // Acessing with the help of object



        }
}
