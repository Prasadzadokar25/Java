// Method : concat


/*code using predifine method in java
 *
 * class MethodDemo1{
	public static void main(String [] args){

		String str1 = "prasad";
		String str2 = "zadokar";

		String str3 = str1.concat(str2);
		System.out.println("After concat : "+str3);
	}
}

*/


// code using user difine method 

import java.util.Scanner;
class MethodDemo1{

	static String strconcat(String str1,String str2){

		String str3 = str1+str2;
		System.out.println("After concat : "+str3);
		
		return str3;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String");
		String s1 = sc.next();
		System.out.println("Enter second String");
		String s2 = sc.next();

		strconcat(s1,s2);


		}
	}
