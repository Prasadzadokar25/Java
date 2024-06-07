// Method with body in interface
// we can give body to the method of interface using two keyword
// 1.  static
// 2.  default

interface InterfaceDemo1{

        static void fun(){

		System.out.println("static Method of interface 1");

	}
}

interface InterfaceDemo2 {

        static void fun(){

                System.out.println("static Method of interface 2");

        }
}
class Child implements InterfaceDemo1,InterfaceDemo2 {


        
}
class Client5 {

        public static void main(String args[]){

                InterfaceDemo4 obj =  new Child4();
		// objfun(); error : static method in interface should be call by its class name

		InterfaceDemo1.fun();
		InterfaceDemo2.fun();


        }
}
