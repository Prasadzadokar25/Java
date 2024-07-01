// minimum product of k element in array


class Array35 {

	static int minProductOfKElements(int arr[],int k){

		int minProduct = 1;

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j+1]<arr[j]){

                                        int temp = arr[j+1];
                                        arr[j+1] = arr[j];
                                        arr[j] = temp;
                                }
			}
		}
		for(int i=0; i<k; i++){

			minProduct *= arr[i];
		}
		return minProduct;
	}

	public static void main(String args[]){

		int arr[] = {2,3,4,5,1};
		int k = 3;

		System.out.println("maximun product any "+k+" element = "+minProductOfKElements(arr,k));
	}
}
