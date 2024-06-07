class Demo{
	static int getSum(int num){

		int sum = 0;
		if(num == 1){
			return 1;
		}
		sum = num + getSum(--num);
		return sum;
	}
	public static void main(String args[]){

		int x = 10;
		System.out.println(getSum(x));
	}
}
