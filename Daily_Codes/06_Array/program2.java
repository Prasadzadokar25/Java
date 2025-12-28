/*Takimg array element and print them using for loop
 */

import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("array ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
