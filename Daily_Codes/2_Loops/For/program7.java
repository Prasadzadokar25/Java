// take N as input and print wither is the perfect number or not 


class ForDemo7{
	public static void main(String[] arg){
		
		int N=28;
		int fact=0;

		for(int i=1;i<=N;i++){   // for(int i=1;i<N;i++)
			if(N%i==0){
				fact = fact+i;
			}
		}
		if(2*N==fact){      // if(N==fact)
			System.out.println(N+" is perfect number");
		}
		else{
		        System.out.println(N+" is not perfect number");
		}

	}
}
