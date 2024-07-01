//count pair with given sum 


class Array4 {

	static int countOfPairWithSum(int arr[],int sum){

		int count = 0;
		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i]+arr[j] == sum){

					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,6};
		int pairSum = 7;

		System.out.println(countOfPairWithSum(arr,pairSum));
	}
}

