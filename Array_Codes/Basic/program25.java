// maximun product of two element


class Array25 {

	static int maxProductOfPair(int arr[]){

		int maxProduct = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i]*arr[j] > maxProduct)
					maxProduct = arr[i]*arr[j];
			}
		}
		return maxProduct;
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,0};

		System.out.println("maximun product any two element = "+maxProductOfPair(arr));
	}
}
