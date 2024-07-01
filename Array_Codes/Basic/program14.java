// Maximum repeated element

class Array14 {

	static int maxRepeation(int arr[]){
	
		int maxOccurence = 0;
		int maxOccurElement = arr[0];

		for(int i=0; i<arr.length; i++){

			int count = 0;
			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j]){

					count++;
				}
			}
			if(count>maxOccurence){
				maxOccurence = count;
				maxOccurElement = arr[i];
			}
			else if(maxOccurence == count && arr[i] < maxOccurElement){
				maxOccurElement = arr[i];
			}
		}
		return maxOccurElement;
	}

	public static void main(String args[]){

		int arr[] = {2,4,7,4,1,7,1};

		System.out.println("Maximum repeated element = " + maxRepeation(arr));
	}
}
