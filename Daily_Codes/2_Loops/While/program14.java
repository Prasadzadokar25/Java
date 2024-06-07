// write a progeram to print the sum of all even number and multiplication of all odd number between 1 to 10


class WhileDemo14{
	public static void main(String[] arg){
		int num = 10;
		int i = 1;
		int sum = 0;
		int mul = 1;
		while(i<=num){
			if(i%2==0){
				sum=sum+i;
			}else {
				mul=mul*i;
			}
			i++;
		}
			System.out.println("sum of all even number between 1 to 10 is "+sum);
			System.out.println("multiplication of all odd number between 1 to 10 is "+mul);
		
	}
}
