class Demo{
	/*void fun(int x){
		System.out.println("integer");
	}*/
	/*void fun(char x){
                System.out.println("charector");
        }*/
	void fun(float x){
                System.out.println("flaot");
        }
}
class Client{
	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun('a');
	}
}

