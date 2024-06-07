/* write a java program to print the factors of N
 * input : N=6 */

class ForDemo4{
	public static void main(String[] arg){

		int N=6;

		for(int i=1;i<=N;i++)
			if(N%i==0){
				System.out.println(i);
			}
	}
}
