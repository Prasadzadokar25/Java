// common element in three araay

class Array19 {

	static void commonElement(int arr1[], int arr2[], int arr3[]){

		System.out.println("Common element in three arrays :");

		for(int i=0; i<arr1.length; i++){

			int f1 = 0;
			int f2 = 0;

			for(int j=0; j<arr2.length; j++){

				if(arr1[i] == arr2[j]){	
					f1 = 1;
					break;
				}
			}
			for(int j=0; j<arr3.length; j++){

                                if(arr1[i] == arr3[j]){
                                        f2 = 1;
                                        break;
                                }
                        }
			if(f1 == 1 && f2 == 1)
				System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){

		int arr1[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {4,6,7,8};
		int arr3[] = {2,3,4,5,6,8};

		commonElement(arr1,arr2,arr3);
	}
}


