// write a program to count the digit of the give number


class WhileDemo11{
	public static void main(String[] arg){

		int num = 6522;
		int X = num;
		int count=0;

		while(num!=0){
			count = count+1;  //count++
			num=num/10;
		}
		System.out.println("The numbers of digits in  "+X+" are "+count);
	}
}
