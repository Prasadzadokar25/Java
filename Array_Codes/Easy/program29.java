// pair with given sum exit in array or not


class Array29 {

	static boolean pairWithSum(int arr[],int sum){

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i]+arr[j] == sum){

					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,6};
		int pairSum = 7;

		System.out.println(pairWithSum(arr,pairSum));
	}
}

