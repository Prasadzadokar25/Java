// Method : indexOf


// code using pridefine method in java


/*
class MethodDemo8{
	public static void main(String [] args){

		String str1 = "Prasadzadokar";
		char ch = 'a';
		int fromindex = 1;


		int x = str1.indexOf(ch,fromindex);
		System.out.println("The firs "+ch+" found at index "+ x +" when we start search from index "+fromindex);
	}
}
*/


//code using user difine method in java


import java.util.Scanner;
class MethodDemo8{

	static int strIndexOf(String str,char ch,int fromindex){
		
		char arr[] = str.toCharArray();
		for(int i = fromindex ; i<arr.length ; i++){
			
			if(ch==arr[i]){
				int x = i;
				System.out.println("The first "+ch+" found at index "+ x +" when we start search from index "+fromindex);
				break;
			}
			
		}
		return -1;
	}
				
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str1 = sc.next();

		System.out.print("Enter the chatter need to search : ");
		char ch1 = sc.next().charAt(0);

		System.out.print("Enter the index were search start : ");
                int fromindex1 = sc.nextInt();
	
		strIndexOf(str1,ch1,fromindex1);
		
	}
}
