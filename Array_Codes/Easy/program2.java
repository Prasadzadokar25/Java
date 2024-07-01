// sort the array  


class Array2 {

	static void sortArray(int arr[]){

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j]>arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int num:arr)
			System.out.print(num+" ");

		System.out.println();
	}
	public static void main(String args[]){

		int arr[] = {1,2,0,2,1};
		
		System.out.println("array sorted as :");

		sortArray(arr);
	}
}
