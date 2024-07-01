// roated array


class Array8 {

	public static void main(String args[]){

		int arr[] = {30,40,70,80,90};
		int rotation = 2;

		 int temp = 0;

                for(int j=0; j<rotation; j++){

                        temp = arr[0];
			for(int i=0; i<arr.length-1; i++){

                        	arr[i] = arr[i+1];
                        }
			arr[arr.length-1] = temp;
                }
		System.out.println("Array after roation");

		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}

