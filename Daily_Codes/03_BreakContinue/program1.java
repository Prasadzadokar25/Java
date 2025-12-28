// write a program to print that number is prime or not use break/continue



class BCDemo1{
	public static void main(String[] arg){

		int N=7;
		int count=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				count=count+1;
			}
		
			if(count>2){
				break;
			}
		}if(count==2){
			   System.out.println(N+" is prime number");
		}else{
			   System.out.println(N+" is not prime number");
	
		}
	}
}			
