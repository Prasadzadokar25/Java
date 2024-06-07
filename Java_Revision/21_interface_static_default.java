interface Demo1{

	static void fun(){
		System.out.println("in Demo1 fun");
	}
}
interface Demo2{

        static void fun(){
                System.out.println("in Demo2 fun");
        }
}

interface Child extends Demo1,Demo2{
}
class Client implements Child{
       public static void main(String[] args){
	       Client obj = new Client();

	       Demo1.fun();
       }
}




