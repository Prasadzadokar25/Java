/* write a program to reverse the given number
   input  : 942111423
   outout : 324111249 */



class WhileDemo17{
	public static void main(String[] arg){

		int N=942111423;
		int rev=0;
		while(N!=0){
			int r=N%10;
			rev=(rev*10)+r;
			N=N/10;
		}
		System.out.println(rev);       // we use 'rev' outside the while loop hence we difine it out side the while loop 
	}
}
