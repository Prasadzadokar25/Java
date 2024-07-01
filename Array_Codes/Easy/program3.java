// dublicate element in array


class Array3 {

	static void getDublicateElement(int arr[]){

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j]>arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int count = 0;
		for(int i=1; i<arr.length; i++){
			
			if(arr[i]==arr[i-1]){

				System.out.print(arr[i]+" ");
				count++;
			}
		}
		if(count == 0){
			System.out.print(-1);
		}

		System.out.println();
	}
	public static void main(String args[]){

		int arr[] = {1,0,2};
		
		System.out.println("dublicate element in array are :");

		getDublicateElement(arr);
	}
}
