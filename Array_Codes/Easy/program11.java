// cheack array is sorted or not


class Array11 {

	static void getOccurenceOfElements(int arr[]){

		int max = arr[0];

		for(int i=0; i<arr.length; i++){

			if(arr[i] > max){
				max = arr[i];
			}		
		}
		for(int i=1; i<=max; i++){

			int count = 0;

			for(int j=0; j<arr.length; j++){

				if(arr[j] == i){
					count++;
				}
			}
		System.out.println(i+" occure "+count+" time ");	
		}
	}

	public static void main(String args[]){

		int arr[] = {1,2,4,5};

		getOccurenceOfElements(arr);
	}
}

