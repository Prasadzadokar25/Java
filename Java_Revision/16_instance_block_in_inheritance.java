class Parent{
	static{
		System.out.println("in parent static");
	}	
	{
		System.out.println("in parent instance");
	}
	Parent(){
		System.out.println("in parent constructor");
	}
}
class Child extends Parent{

	static{
                System.out.println("in child static");
	}
	{
                System.out.println("in child instance");
        }
        Child(){
                System.out.println("in child constructor");
        }
}
class Program16{
	public static void main(String args[]){

		Child obj = new Child();

	}
}
