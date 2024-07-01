// unique element in array

class Array13 {

	static void uniqueElement(int arr[]){


		System.out.println("Uniqu elements are :");

		for(int i=0; i<arr.length; i++){

			int count = 0;
			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j]){

					count++;
				}
				if(count>1){
					break;
				}
			}
			if(count == 1){

				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

	public static void main(String args[]){

		int arr[] = {2,4,7,4,4,7,1};

		uniqueElement(arr);
	}
}
