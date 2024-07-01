// maximum product of 3 element in array


class Array23 {

	static int maxProductOf3lements(int arr[]){

		int maxProduct = 1;

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j+1]<arr[j]){

                                        int temp = arr[j+1];
                                        arr[j+1] = arr[j];
                                        arr[j] = temp;
                                }
			}
		}
		for(int i=arr.length-3; i<arr.length; i++){

			maxProduct *= arr[i];
		}
		return maxProduct;
	}

	public static void main(String args[]){

		int arr[] = {10,3,5,6,20};

		System.out.println("maximun product any 3 element = "+maxProductOf3lements(arr));
	}
}

