// Method : length


// code using pridefine method in java
 

/*
 * class MethodDemo2{
  	public static void main(String [] args){

		String str = "Srushti";
		System.out.println("Length of string : "+str.length());
	}
}
*/



// code using user define method in java



import java.util.*;
class MethodDemo2{

	int strlength(String str){

		char arr[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		System.out.println("length of string : " +count);
	       return count;
	}

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to find length");
		String str1 = sc.next();
		MethodDemo2 obj = new MethodDemo2();
		obj.strlength(str1);
	}
}
