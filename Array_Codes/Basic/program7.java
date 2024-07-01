// form the largest number 


class Array7 {

	public static void main(String aergs[]){

		int arr[] = {9,0,1,3,0};
		int  gretestNo = 0;

		 for(int i=0 ; i<arr.length ;i++){

			 for(int j=0 ;j<arr.length-1; j++){

				 if(arr[j]<arr[j+1]){

					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
		 
		 for(int i=0; i<arr.length; i++){

			 gretestNo = gretestNo*10+arr[i];
		 }
		 System.out.println(gretestNo);	 
		
	}
}
