// smallest and secound smallest element in array 


class Array23 {

	static void firstSecoundSmall(int arr[]){

		int small = arr[0];
		int secoundSmall = 100000;

		for(int j=0; j<arr.length; j++){

			if(arr[j]<small)	
				small = arr[j];
		
			if(arr[j]<secoundSmall && arr[j]>small)
				secoundSmall = arr[j];
		}
		
		System.out.println("Smallest = "+small);
		System.out.println("Secound Smallest = "+secoundSmall);
	}

	public static void main(String args[]){

		int arr[] = {2,4,3,5,6};
		
		firstSecoundSmall(arr);
	}
}
