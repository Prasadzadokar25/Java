// Method : append

import java.util.Scanner;
class MethodDemo1{

	static StringBuffer myAppend(StringBuffer s1,StringBuffer s2){

		StringBuffer str =s1;
		str += s2; 

		

		return str;
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter first string :");
		StringBuffer str1 = new StringBuffer( sc.next());

		System.out.println("Enetr second String :");
		StringBuffer str2 = new StringBuffer( sc.next());

		System.out.println(myAppend(str1,str2));
	}
}
