// concept => Real time example on constructor


class Student {

	int rollNum = 0;
	String name = "prasad";

	Student (){
		rollNum = 71;

		System.out.println("Roll number ="+ rollNum);
		System.out.println("Name  ="+ name);
		
	}
	public static void main(String args [] ){
		Student obj = new Student();
		
	}
}
