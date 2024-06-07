class Demo{

	static int printSeries(int x){

		if(x<=1){
			return x;
		}

		return printSeries(x-1) + printSeries(x-2);
	}
	public static void main(String[] args){

		int x = 6;
		System.out.println(printSeries(x));
	}
}
