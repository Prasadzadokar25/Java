class Demo{

	int fun(){

		return 10;
	}
}
class Child extends Demo{

	float fun(){
		return 10.0f;
	}
}
class Client {
	public static void main(String args[]){

		Child obj = new Child();
		obj.fun();
	}
}
