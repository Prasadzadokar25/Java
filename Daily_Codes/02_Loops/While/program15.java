/* write a program to print the revers nunbers from the number to 1 if it is even
 * and if the number is odd print revers number order by differ two
 */ 



class WhileDemo15{
	public static void main(String[] arg){

		int N=6;
		if(N%2==0){
			while(N>0){
				System.out.println(N);
				N--;
			}
		}else{
		       while(N>0){
			       System.out.println(N);
			       N=N-2;
		       }
		}
	}
}
