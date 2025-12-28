// write a java program to count odd digit in give number


class WhileDemo12{
	public static void main(String[] arg){

		int N=145870;
		int count=0;

		while(N!=0){
			int rem=N%10;
			if(rem%2!=0){
				count = count+1;
				
			}
			N=N/10;
		}
			
			System.out.println(count);
	
	}
}
