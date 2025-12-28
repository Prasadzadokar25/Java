// Metgod : substring


import java.util.Scanner;
class MethodDemo13{

	static int strSubstring(String str,int index1,int index2){

		char arr1[] = str.toCharArray();
		int size = index2-index1;
		char arr2[] = new char[size];
		int j = 0;
		for(int i =index1;i<index2 ; i++){
			arr2[j] = arr1[i];
			j++;
		}
		System.out.println(arr2);
		return 0;
	}


	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str1 = sc.next();
		
		System.out.print("Enter the start index  : ");
		int in1 = sc.nextInt();

		System.out.print("Enter the end index  : ");
		int in2 = sc.nextInt();

		strSubstring(str1,in1,in2);
	}
}
