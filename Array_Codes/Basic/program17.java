// prooduct of maximum and minimum element of two array


class Array17 {

	static int maxMinProduct(int arr1[] ,int arr2[]){

		int max = arr1[0];
		int min = arr2[0];

		for(int i=0; i<arr1.length; i++){

			if(arr1[i]>max){

				max = arr1[i];
			}
		}
		for(int i=0; i<arr2.length; i++){

                        if(arr2[i]<min){

                                min = arr2[i];
                        }
                }
		return max * min;
	}
	public static void main(String args[]){

		int arr1[] ={2,5,4,7};
		int arr2[] = {5,7,8,-2,6};

		System.out.println("prosduct of max and min elements of two array = "+maxMinProduct(arr1,arr2));
	}
}
