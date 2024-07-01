// element in the reange


class Array6 {

	public static void main(String args[]){

		int arr[] = {1,5,4,2,7,8,3};

		int r1 = 2;
		int r2 = 5;

		int matchNo = r2-r1+1;
		int count = 0;

		for(int i=0; i<arr.length ; i++){

			for(int j=r1 ; j<=r2; j++){

				if(arr[i]==j){

					count++;
					break;
				}
				
			}
		}
		if(count == matchNo){
			
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
	}
}	
