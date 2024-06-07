import java.util.*;

class Demo{
	public static void main(String[] args){

		int[] arr = {2,1,3,4,6,4};

		for(int i=0; i<arr.length; i++){

			int min_index = i;

			for(int j = i+1; j<arr.length; j++){

				if(arr[j]<arr[min_index]){
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
