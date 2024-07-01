// find first reapiting element

class Array10{
	static int getFirstRepeatEle(int arr[]){

		int lastIndex = arr.length-1;
                int firstReapeat = 0;

		for(int i=0; i<arr.length; i++){
			
			int count = 0;

			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j])	
					count ++;
					
				if(count >1 && j<= lastIndex){

					firstReapeat = arr[i];
					lastIndex = j;
					break;
				}
			}
		}
		return firstReapeat;
	}

	public static void main(String args[]){

		int arr[] = {1,7,4,4,,8,7,7};
	
		System.out.println("first reapeted element = "+getFirstRepeatEle(arr));
	}
}
