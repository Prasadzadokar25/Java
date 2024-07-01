// itersection of two array


class Array14 {

	public static void main(String args[]){

		int arr1[] = {30,40,70,80,90};
		int arr2[] = {10,20,30,40};

		int tempArray[] = new int[arr1.length];


		int index = 0;

		for(int i=0; i<arr1.length; i++){

			for(int j=0; j<arr2.length; j++){

				if(arr1[i] == arr2[j]){

					tempArray[index] = arr1[i];
					index++;
					break;
				}
			}
		}
		

		int intersectionArray[] = new int[index];

		for(int i=0; i<index; i++){

			intersectionArray[i] = tempArray[i];
		}

		for(int num:intersectionArray){
			System.out.print(num+" ");
		}
		System.out.println();

	}
}

