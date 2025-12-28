/* Array Declaration and printing it element without for loop
 */

class ArrayDemo1{
	public static void main(String [] args){

		int arr1[] = new int[3];    //Type 1

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		int arr2[] = {10,20,30};   //Type 2

		int arr3[] = new int[]{10,20,30}; //Type 3
	}
}
