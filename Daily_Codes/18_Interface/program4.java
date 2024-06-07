// Method with body in interface

interface InterfaceDemo4 {

        static void fun(){

		System.out.println("static Method of interface");

	}
}

class Child4 implements InterfaceDemo4 {

        
}
class Client4 {

        public static void main(String args[]){

                InterfaceDemo4 obj =  new Child4();
		// objfun(); error : static method in interface should be call by its class name

		InterfaceDemo4.fun();


        }
}
