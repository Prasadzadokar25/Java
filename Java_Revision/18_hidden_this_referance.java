class Demo{
	int x = 10;

	Demo(){
		System.out.println(x);
		System.out.println(this);
	}
	void display(){
		System.out.println(x);
		System.out.println(this);
	}
	public static void main(String[] args){

		Demo obj = new Demo();
		obj.display();
		System.out.println(obj);
	}
}
