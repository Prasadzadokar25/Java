// remove element from the specific place


class Array9 {

	static void remove(int arr[],int index) {

		int arr2[] = new int [arr.length-1];
	
		for(int i=0; i<arr.length-1; i++){

			if(i >= index){

				arr2[i] = arr[i+1];
			}
			else{
				arr2[i]=arr[i];
			}
		}
		System.out.println("Array after removing element ");

		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String args[]){

		int arr[]= {1,2,3,4,5};
		int index = 3;

		remove(arr,index);
	}
}


