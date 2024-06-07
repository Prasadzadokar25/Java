// Concept => Constructor get called atomaticaly each time when object is created


class ConstructorDemo2 {

	ConstructorDemo2 (){
		System.out.println ("call to constructor");
	}
	public static void main (String args[]) {

		ConstructorDemo2 obj1 = new ConstructorDemo2(); // for each new object constructor get called
		ConstructorDemo2 obj2 = new ConstructorDemo2();
		ConstructorDemo2 obj3 = new ConstructorDemo2();
	}
}
