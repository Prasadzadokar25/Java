/* java a java program to print the factorial of N
   input N = 5 */

class ForDemo3{
	public static void main(String[] args){

		int N = 5;
		int fact =1;

		for(int i=1;i<=N;i++){
			fact = fact*i;
		}
		System.out.println("The factorial of "+N+" is "+fact);
	}
}
