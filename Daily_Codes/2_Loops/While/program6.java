/* Take and number and print sum of its digit
 */


class WhileDemo6{
	public static void main(String[] arg){

		int num = 6531;
		int N = num;
		int sum = 0;

		while(num!=0){
			int remainder = num%10;
			sum = sum + remainder;
			num = num/10;
		}
		System.out.println("sum of all digit in "+N+" is "+sum);
	}
}
