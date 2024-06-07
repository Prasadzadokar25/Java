class Demo {

	static int getFactorial(int num){

		if(num == 1){
			return 1;
		}
		return num * getFactorial(--num);
	}
	public static void main(String args[]){

		int num = 4;
		System.out.println(getFactorial(num));
	}
}
