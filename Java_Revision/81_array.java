import java.util.*;

class Demo{
	public static void main(String[] args){

		int[] arr = {1,2,3,4,5,6,7};

		for(int i=0; i<arr.length; i=i+2){

			if(i == arr.length-1){
				continue;
			}

			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
