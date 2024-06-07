class Demo{
	void display(Demo obj){
		System.out.println(obj);
	}
	void display(int x){
		System.out.println(x);
	}
	public static void main(String[] args){

		Demo obj = new Demo();
		obj.display(100);
		obj.display(obj);
	}
}
