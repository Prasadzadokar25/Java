// occurence of number in array


class Array12 {

	static int getOccurenceOfElement(int arr[], int num){

		int count = 0;
		for(int i=0; i<arr.length; i++){

			if(arr[i] == num){
				count ++;
			}
		}
		return count;
	}
	public static void main(String args[]){

		int arr[] = {2,3,2,3,2,7};
		int num = 2;

		System.out.println(getOccurenceOfElement(arr,num));
	}
}
