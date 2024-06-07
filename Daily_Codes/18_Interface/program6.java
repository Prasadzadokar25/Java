// static method in interface does not come in child class though inheritance

interface InterfaceDemo1{

        static void fun(){

                System.out.println("static Method of interface 1");

        }
}

class Child implements InterfaceDemo1 {


	void fun() {

		System.out.println("in fun method of child class");
	}
}
class Client6 {

        public static void main(String args[]){

                Child obj =  new Child();
                obj.fun();

                InterfaceDemo1.fun();
                


        }
}
