/* Take a number and print the multiplication of its digit
 */

class WhileDemo7{
	public static void main(String [] arg){

		int N = 6531;
                int mul = 1;

		while(N!=0){
			int remainder = N%10;
			mul = mul*remainder;
			N = N/10;
		}
	System.out.println("multiplication of digits in the number is "+mul);
	}
}
