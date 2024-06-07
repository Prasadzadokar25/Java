// Method : inserst

import java.util.*;
class MethodDemo2{

	static  void myInsert(StringBuffer s1,StringBuffer s2,int index){

		System.out.println();
		String s3 = s1.toString();
		String s4 = s2.toString();

		char arr1[] = s3.toCharArray();
		char arr2[] = s4.toCharArray();

		char arr3[] = new char[arr1.length + arr2.length];

		for(int i=0 ; i<index; i++){
			arr3[i] = arr1[i];
		}
		int j =0;
		for(int i=index; i<(index+arr2.length); i++){
			arr3[i] = arr2[j];
			j++;
		}
		int k = index;

		for(int i=index+arr2.length ; i<arr3.length ; i++){
			arr3[i] = arr1[index];
			index++;
		}
		System.out.print(arr3.toString());

		String s5 = "ppi";
		System.out.println(s5);

		StringBuffer s6 = new StringBuffer("prasad");
		System.out.println(s6);

		
	}


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter the String :");
		StringBuffer str1 = new StringBuffer(sc.next());

                System.out.println("Eneter the String which need to insert :");
                StringBuffer str2 = new StringBuffer(sc.next());


		System.out.println("Eneter the index :");
                int index1 = sc.nextInt();

		myInsert(str1,str2,index1);
	}
}
