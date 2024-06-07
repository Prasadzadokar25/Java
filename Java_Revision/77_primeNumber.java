class Demo{
	public static void main(String[] args){

		int x = 100;

		int count = 0;
		for(int i=2; i<=x; i++){

			int flag = 0;
			for(int j=2; j*j<=i; j++){

				if(i%j == 0){
					flag = 1;
					break;
				}
				count ++;

			}
			if(flag == 0){
				System.out.println(i);
			}
		}
		 System.out.println(count);
	}
}
