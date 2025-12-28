// WAP to print the numbers from 1 to the first number divisible by three if first number which is divisible 
// by 3 is greater than 40 don't print it


class BCDemo2{
	public static void main(String[] arg){

		int N=40;

		for(int i=1;i<=N;i++){
			if(i%3==0){
				break;
			}
			System.out.println(i);
		}
	}
}
