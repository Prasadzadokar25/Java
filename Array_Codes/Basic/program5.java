class Array5 {

        public static void main(String args[]){

		int num = 1005;

		int newNum = 0;
		int x = 1;
		
		while(num!=0){

			int rev = num % 10;

			if(rev==0){

			        rev=5;
                        }
		

		newNum = newNum + rev * x ;
		x = x*10;

		num = num/10;
		}
	
	System.out.println(newNum);
	}

}
