/* concept = Multilevel Inheritance
 */


class GrandParent7 {

	GrandParent7() {

		System.out.println("In GrandParent");
	}
}
class Parent7 extends GrandParent7 {

	Parent7 () {

		System.out.println("In Parent");
	}
}
class Child7 extends Parent7 {

	Child7() {

		System.out.println("In child");
	}
	public static void main(String [] args ) {

		Child7 obj = new Child7();
	}
}

