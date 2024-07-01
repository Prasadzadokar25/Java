// missing number in array


class Array1 {

	static void getMissingElement(int arr[]){

		int max = arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}

		for (int i=1; i<=max; i++){
			
			int flag = 0;
			for(int j=0; j<arr.length; j++){

				if(arr[j]==i){
					flag = 1;
				}
			}
			if(flag == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String args[]){

		int arr[] = {1,2,4,5,8};
		
		System.out.println("Missing digits are :");

		getMissingElement(arr);
	}
}
