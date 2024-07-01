// Exceptionally odd 


class Array22 {

	static void exceptionallyOdd(int arr[]){

		for(int i=0; i<arr.length; i++){
			
			int count = 0;

			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j])	
					count ++;
			}
			if(count%2 != 0) {

					System.out.println("Exceptionally odd is "+arr[i]);
					return ;
			}
		}
		System.out.println("No exceptionlly odd element found");
	}

	public static void main(String args[]){

		int arr[] = {1,2,6,6,1,2,6};
		
		exceptionallyOdd(arr);
	}
}
