/* Concept = If parent and child class have same variable then acess 
 * the variable of parent class with 'super'
 *
 */


class Parent5 {

	int x = 10;

	static int y = 20;

	Parent5() {
		
		System.out.println("In Parent");
	}
}
class Child5 extends Parent5 {

	int x = 500;
	static int y = 600;

	Child5() {

		System.out.println("In Child");
	}
	void acess () {

		System.out.println(super.x);   // Parent class variable 
		System.out.println(super.y);

		System.out.println(x);         // child class variable
		System.out.println(y);

		System.out.println(this.x);         // child class variable because we created object of child class
                System.out.println(this.y);
	}
}
class Client5 {
	
	public static void main(String args[]) {

		Child5 obj = new Child5();
		obj.acess();
	}
}
