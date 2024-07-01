// number of pair with specific sum


class Array27 {

	static int countOfPairHavingSum(int arr[],int sum){

		int count = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i]+arr[j] == sum)
					count++;
			}
		}
		return count;
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,0,6};
		int sum = 6;

		System.out.println("count of pair having sum "+sum+" = "+countOfPairHavingSum(arr,sum));
	}
}
