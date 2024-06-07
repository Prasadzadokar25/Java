class Demo{

	String fun(){
		return new String();
	}
}
class Child extends Demo{

	Object fun(){
		return new String();
	}
}
class Client{
	public static void main(String[] args){

		Child obj = new Child();
		obj.fun();
	}
}
