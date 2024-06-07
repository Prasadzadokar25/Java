// Take N as input and print wither the number is prime or not

class ForDemo6{
	public static void main(String[] arg){

		int N=7;
		int fact=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				fact=fact+1;
			}
		}
			if(fact==2){
				System.out.println(N+" is prime number ");
			}else if(fact==1){
				System.out.println(N+" is not prime not composite ");
			}else{
				System.out.println(N+" is not prime that means it is composite ");
			}
		
	}
}
