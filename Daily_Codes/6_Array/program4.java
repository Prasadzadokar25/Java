/*print sum of all element in an array of size 5
 */


import java.util.*;
class ArrayDemo4{
        public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

                int arr1[] = new int[5];
		System.out.println("Enter array element");
		
		int sum = 0;
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();
			sum = sum+arr1[i];
		}
		System.out.println("sum of all element in an array = "+sum);
	}
}
