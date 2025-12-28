// write a java program to calculate the factorial of given number 

class WhileDemo10{
	public static void main(String[] arg){

		int num = 6;
		int X = num;
		int fact = 1;
		
		while(num>0){
			fact=fact*num;
			num--;
		}
	System.out.println("factorial of "+X+" is "+fact);
	}
}

/*
  class WhileDemo10{
  	public static void main(String[] arg){
  		
  		int num = 6;
  		int X = num;
  		int fact = 1;
  		int i = 1;
 
  		while(i<=num){
  			fact = fact*i;
  			i++;
		}
	}
  }
 */
