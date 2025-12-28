// Method : replace

import java.util.Scanner;
class MethodDemo12{

		static int  strReplace(String str,char c1, char c2 ){


		char arr[] = str.toCharArray();
		for(int i=0 ; i<arr.length ; i++){

			if(c1==arr[i]){
				arr[i]=c2;
			}
		}
				System.out.println(arr);
		
		
		return 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string  :  ");
		String str1 = sc.next();

		System.out.print("Enter the chareter need to replace  : ");
		char ch1 = sc.next().charAt(0);

		System.out.print("Enter the chareter  : ");
		char ch2 = sc.next().charAt(0);

		strReplace(str1,ch1,ch2);
	}
}
