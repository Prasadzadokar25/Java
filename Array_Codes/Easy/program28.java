// product Array puzzle 


class Array28 {

	static int[] productArrayPuzzle(int arr[]){

		int productArray[] = new int[arr.length];
	
		for(int i=0; i<arr.length; i++){

			int product = 1;

			for(int j=0; j<arr.length; j++){

				if(i!=j){
					product *= arr[j];
				}
			}
			productArray[i] = product;

		}
	
		return productArray;
	}

	public static void main(String args[]){

		int arr[] = {10,3,5,6,2};

		int productArray[] = productArrayPuzzle(arr);

		for(int num:productArray){

			System.out.print(num+" ");
		}
		System.out.println();
	}
}
