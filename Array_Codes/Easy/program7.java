// cheack array is sorted or not


class Array7 {

	static int isArraySorted(int arr[]){

		for(int i=0; i<arr.length-1; i++){

			if(arr[i+1] < arr[i]){
				return 0;
			}		
		}
		return 1;		
	}

	public static void main(String args[]){

		int arr[] = {30,40,70,80,90};

		System.out.println(isArraySorted(arr));
	}
}

