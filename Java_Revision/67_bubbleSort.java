import java.util.Arrays;

class Demo{
	public static void main(String[] args){

		int[] arr = {10,30,20,15,25};

		for(int i=0; i<arr.length; i++){

			int flag = 0;
			for(int j=0; j<arr.length-1-i; j++){

				
				if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				flag = 1;
				}
			}
			if(flag == 0){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
