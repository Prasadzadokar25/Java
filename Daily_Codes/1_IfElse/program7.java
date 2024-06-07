/* Take a number
 * print 'fizz' if it is divisible by 3
 * print 'buzz' if it is divisible by 5
 * print 'fizz-buzz' if it divisible by both
 * print "Not divisible by both' is it not divisible by both
 * */


 class IfElseDemo7{
	public static void main(String[] arg){

		int num = 15;

		if(num%3 == 0 && num%5 == 0){
			System.out.println("fizz-buzz");
		}else if(num%3 == 0){
			System.out.println("fizz");
		}else if(num%5 == 0){
			System.out.println("buzz");
		}else{
			System.out.println("Not divisible by both");
		}
	}
}
