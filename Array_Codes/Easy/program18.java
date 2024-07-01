// Move all zero to the end of array


class Array18 {

	static int[] moveZeroToLast(int arr[]){

		int count = 0;
		int temp = 0;
		for(int i=0; i<arr.length-count; ){

			if(arr[i] == 0){

				temp = arr[i];	
				for(int j=i; j<arr.length-1-count; j++){
					arr[j]=arr[j+1];
				}

				arr[arr.length-1-count]=temp;
				count++;
			}
			else{
				i++;
			}
		}
		return arr;
	}
	public static void main(String args[]){

		int arr[] = {2,0,0,2,0,7};
		int newArray[] = moveZeroToLast(arr);

		for(int num:newArray){

			System.out.print(num+" ");
		}
		System.out.println();

	}
}
