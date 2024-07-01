// find Bitonic point

class Array20 {

	static int getBitonicPoint(int arr[]){

		int max = arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i] > max ){
				max = arr[i];
			}
		}
		if(arr[arr.length-1] == max){

			return arr[arr.length-1];
		}

		for(int i=1; i<arr.length-1; i++){

			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
				
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String args[]) {

		int arr[] = {1,15,25,45,22,17,12,11};
		
		System.out.println(getBitonicPoint(arr));
	}
}
