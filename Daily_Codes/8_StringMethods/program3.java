// Method : charAt


// code using pridefine method in java


/*class MethodDemo3{
        public static void main(String [] args){

                String str = "SrushtiDadas";
                System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(24));  // Error [ String index out of range ]
        }
}

*/


// code using user define method in java


import java.util.Scanner;
class MethodDemo3{

	static int strCharAt(String str,int charIndex){

		char arr[] = str.toCharArray();
		System.out.println( arr[charIndex] );
		return arr[charIndex];
	}
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter String");
		String str1 = sc.next();

		System.out.println("Enter index at which charecter need to find");
		int index = sc.nextInt();

		strCharAt(str1,index);
	}
}


