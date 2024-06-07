class Demo{

	static void validate(int age){

		if(age<18){
			throw new ArithmeticException("not eligiable");
		}
	}
	public static void main(String[] args){

		validate(13);
	}
}
