class Demo{
	void fun(String x){
		System.out.println("String");
	}
	/*void fun(char x){
                System.out.println("charector");
        }*/
	void fun(StringBuffer x){
                System.out.println("StringBuffer");
        }
}
class Client{
	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun("prasad");
		obj.fun(new StringBuffer("om"));
		obj.fun(null);
	}
}

