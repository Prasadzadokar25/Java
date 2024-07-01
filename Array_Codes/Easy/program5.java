// find peak element : element whiich is not small than its neighbors


class Array5 {

	static void eleGreaterThanNeighbors(int arr[]){

		for(int i=0; i<arr.length; i++){
			
			if(i==0){
				if(arr[i]>arr[i+1]){
					System.out.print(i+" ");
				}
			}
			else if(i == arr.length-1){
				if(arr[i]>arr[i-1]){

					System.out.print(i+" ");
				}
			}
			
			else if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){

				System.out.print(i+" ");
			}
		}
		System.out.println();		
	}

	public static void main(String args[]){

		int arr[] = {3,4,2,5,6};

		System.out.println("index of Element which is not smaller than neighbours ");
		eleGreaterThanNeighbors(arr);
	}
}

