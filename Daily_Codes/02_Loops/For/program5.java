/* write a java program to cout the factors of N
 * input : N=15;
 */

class ForDemo5{
	public static void main(String[] arg){

		int N=15;
		int count=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				count = count+1;  // count++;
			}
		}
		System.out.println("The count of factors of "+N+" is "+count);
	}
}
