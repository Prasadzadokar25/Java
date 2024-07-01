// move all -ve element to beginning and all +ve element at the end


class Array37 {

	static void movePostiveToEnd(int arr[]){

		int newArray[] = new int[arr.length];

		int ni = 0;
		int pi = arr.length-1;
		int j = arr.length-1;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i]<0){

				newArray[ni]=arr[i];
				ni++;
			}
			if(arr[j]>=0){
				newArray[pi]=arr[j];
					pi--;
					
			}
			j--;
		}
		for(int num:newArray){

			System.out.print(num+" ");
		}
		System.out.println();		
	}

	public static void main(String args[]){

		int arr[] = {3,4,2,5,-1};

		movePostiveToEnd(arr);
	}
}
