/* write a program to print the number upto the first number which
 * is divisiable by 3 add 5 between 1 to 40*/



class BCDemo4{
	public static void main(String[] arg){
		 
		for(int i=1;i<=40;i++){
			if(i%5==0 && i%3==0){
				break;
			}
			System.out.println(i);
		}
	}
}
