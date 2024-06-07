class Demo{
	
	static int getDigitSum(int num){

		if(num==0){
			return 0;
		}

		return num%10 + getDigitSum(num/10);
	}

	public static void main(String args[]){

		int x = 171;

		System.out.println(getDigitSum(x));
	}

}
