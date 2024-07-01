// sub array for specific sum

class Array18 {
		

	static void sumSubArray(int arr[] ,int sum){
	    
		int subArrayStart = -1;
                int subArrayEnd = -1;
		      
		for(int i=0;i<arr.length; i++){

                      int subArraySum = 0;

                        for(int j = i; j<arr.length; j++){

				subArraySum += arr[j];

				if(subArraySum == sum){

					subArrayStart = i;
					subArrayEnd = j;
				}

                        }
		}
		if(subArrayStart == -1){

			System.out.println("No sub array found with sum "+sum);
			return;
		}
		System.out.println("The sum found between index " + subArrayStart+" and "+subArrayEnd);
	}

	public static void main(String args[]) {

		int arr[] = {1,2,3,4};
		int sum = 9;

		sumSubArray(arr,sum);
	}
}
