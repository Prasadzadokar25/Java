class Program16{
	int x= 10;
	private int y = 20;
	static int z = 30;

	void display(){
		System.out.print(x+" ");
		System.out.print(y+" ");
		System.out.print(z+" ");
		System.out.println();
	}
}
class Main{
	public static void main(String[] args){

		Program16 obj1 = new Program16();
		Program16 obj2 = new Program16();

		obj1.display();
		obj2.display();
		System.out.println(System.identityHashCode(obj1.x));
		System.out.println(System.identityHashCode(obj2.x));

		obj1.x = 100;
		obj1.z = 300;

		obj1.display();
                obj2.display();
                System.out.println(System.identityHashCode(obj1.x));
                System.out.println(System.identityHashCode(obj2.x));
		System.out.println("***************");
		System.out.println(System.identityHashCode(main));
	}
}
