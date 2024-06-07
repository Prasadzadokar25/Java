/* Concept = If we create object with parent referance and child objet
 *           then we can acess only those methods which are present in 
 *           both classes
 */ 


class Parent4 {

	void fun () {

		System.out.println("In fun of child");
	}
}
class Child4 extends Parent4 {

	void fun() {

		System.out.println("In fun of child");
	}

	void gun() {

		System.out.println("In gun of child");
	}
}
class Client4 {
	public static void main(String args[] ) {

		Parent4 obj = new Child4();
		obj.fun();
		/* obj.gun();  error :  can not find symboll not found
		 			even if child class has gun method
				        we create object with parent refernce hence parent 
					class should also have gun method */
	}
}
