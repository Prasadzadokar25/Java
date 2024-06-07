// Method : compareToIgnoreCase

// code using pridefine method in java

/*
 * class MethodDemo5{
        public static void main(String [] args){

                String str1 = "prasad";
                String str2 = "am";
                String str3 = "AM";
                String str4 = "Prasad";

                System.out.println(str1.compareToIgnoreCase(str2));
                System.out.println(str2.compareToIgnoreCase(str3));
                System.out.println(str1.compareToIgnoreCase(str4));
        }
}
*/


// code using userdefine method in java

import java.util.Scanner;
class MethodDemo5{

	static int myCompareToIngnoreCase(String str1,String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int result = 0;

		if(arr1.length==arr2.length){
			
			int count = 0;

			for(int i=0;i<arr1.length;i++){

				if(arr1[i]==arr2[i] || arr1[i]+32==arr2[i] || arr2[i]+32==arr1[i]){
					count++;
				}else{
					result = arr1[i]-arr2[i];
					break;
				}
			}
			if(count == arr1.length){
				result = 0;
			}

		}else{
			result = arr1.length-arr2.length;
		}
		return result;
	
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string 1 :");
		String s1 = sc.next();

		System.out.println("Enter the string 2 :");
                String s2 = sc.next();

		System.out.println (myCompareToIngnoreCase(s1,s2));
	}
}
