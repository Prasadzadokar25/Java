// find element whiich is not small than its neighbors


class Array36 {

	static void eleGreaterThanNeighbors(int arr[]){

		for(int i=1; i<arr.length-1; i++){

			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){

				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();		
	}

	public static void main(String args[]){

		int arr[] = {3,4,2,5,0};

		System.out.println("Element which is not smaller than neighbours ");
		eleGreaterThanNeighbors(arr);
	}
}
