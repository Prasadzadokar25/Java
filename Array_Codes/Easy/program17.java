// find all the paires with given sum


class Array17 {

	static void getPairHavingSum(int arr[],int sum){

		int firstElementArry[] = new int[2*arr.length];
		int lastElementArry[] = new int[2*arr.length];

		int count = 0;
			
		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i]+arr[j] == sum){

					firstElementArry[count] = arr[i];
					lastElementArry[count] = arr[j];
					count++;
				}
			}
		}
		for(int i=0; i<count; i++){

			System.out.print(firstElementArry[i]+" ");
			System.out.println(lastElementArry[i]+" ");
		}
		
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,0,6};
		int sum = 7;

		getPairHavingSum(arr,sum);
	}
}
