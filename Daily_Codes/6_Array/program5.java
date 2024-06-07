/* print the count of even and odd elements in array
 */
import java.util.Scanner;
class ArrayDemo5{
        public static void main(String [] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("enter array size");
		int size = obj.nextInt();
                int arr[] = new int[size];

		System.out.println("enter array elements");
		int evencount = 0;
		int oddcount = 0;

		for(int i=0;i<arr.length;i++){
			arr[i] = obj.nextInt();
			if(arr[i]%2==0){
				evencount++;
			}else{
				oddcount++;
			}
		}
		System.out.println("count of even elements in an array = "+evencount);
		System.out.println("count of odd elements in an array = "+oddcount);
	}
}
