// maximum sum arr[i]*i


class Array32 {

	static int maxSum(int arr[]){

		int product = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
		
			product += arr[i]*i;
		}
		return product;
	}


	public static void main(String args[]){

		int arr[] = {5,4,1,3,2};

		System.out.println("max sum of arr[i]*i = "+maxSum(arr));
	}
}
