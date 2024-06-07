//write a program to print the square of the even digit in the give number


class WhileDemo13{
	public static void main(String[] arg){
		
		int N = 865665238;
		while(N!=0){
			int rem=N%10;
			
			if(rem%2==0){
				int square=rem*rem;
				System.out.println(square);
			}
			N=N/10;
		}
	}
}
