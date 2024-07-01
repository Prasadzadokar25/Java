// first element to occure k time 


class Array21 {

	static int occurKTime(int arr[],int k){

		int lastIndex = arr.length-1;
                int firstKTimeReapeat = 0;

		for(int i=0; i<arr.length; i++){
			
			int count = 0;

			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j])	
					count ++;
					
				if(count == k && j<= lastIndex){

					firstKTimeReapeat=arr[i];
					lastIndex = j;
					break;
				}
			}
			
		}
		return firstKTimeReapeat;
	}

	public static void main(String args[]){

		int arr[] = {1,7,4,4,4,8,7,7};
		int k = 2;

		if(occurKTime(arr,k) == -1){
			System.out.println("No element occures "+k+" times ");
		}
		else{
			System.out.println("element "+occurKTime(arr,k)+" occur "+k+" times");
		}
	}
}
