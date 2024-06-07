/* Overriding = Two different methods having same name and parameter 
 *   		but in different classes having parent child retion
 */

class Parent1 {

	void marrege() {

		System.out.println("Arrange marrege");
	}
	void property () {

		System.out.println("10 lack");
	}
}
class Child1 extends Parent1 {

	void marrege() {         // overriding marrege mrthod

		System.out.println("Love marrege");
	}
}
class Client1 {

	public static void main(String args[]){

		Child1 obj = new Child1();
		obj.marrege();
		obj.property();   // propety method remain as it is
	}
}
