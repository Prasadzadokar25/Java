// write a program to print wheter the number is palindrom or not



class WhileDemo18{
	public static void main(String[] arg){

		int num = 2552;
		int rev = 0;
		int orinum = num;

		while(num!=0){
			int r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		if(rev==orinum)
			System.out.println(orinum+" is palindrom number");
		
		else 
			System.out.println(orinum+" is not palindrom number");
	}
}
