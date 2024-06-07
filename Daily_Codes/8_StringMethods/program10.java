// Method : startWith

// code using predifine method in java

/*
 class MethodDemo10{
	public static void main(String [] args){

		String str1 = "Srushti";
		System.out.println(str1.startsWith("S");
	}
}

*/


// code using user difine marthod in java

import java.util.Scanner;
class MethodDemo10{

	static boolean strStartsWith(String str1 ,String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int count = 0;
		for(int i=0; i<arr2.length; i++){
		
			if (arr1[i]==arr2[i]){
				count++;
			}else{
				break;
			}
		}	
		if(count==arr2.length){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		return true;
	}
	
               
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter the string : ");
		String str1 = sc.next();

		System.out.print("Enter the startimg string which need to check : ");
		String str2 = sc.next();

		strStartsWith(str1,str2);
	}
}
