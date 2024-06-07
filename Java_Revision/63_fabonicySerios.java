class Demo{
	public static void main(String args[]){

		int x = 5;

		int sum=1;
		int lsum = 0;

		for(int i=0; i<x; i++){
			
			int temp = sum;
			sum = sum +lsum;
	       		lsum = temp;

			System.out.println(sum);
		}
	}
}	
