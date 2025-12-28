/* Take a number and print all its digits
 */

class WhileDemo5{
	public static void main(String[] arg){

		int N = 6531;
		while(N!=0){
			System.out.println(N%10);
			N = N/10;
		}
	}
}
