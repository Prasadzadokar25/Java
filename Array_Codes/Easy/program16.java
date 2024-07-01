// roated array


class Array16 {

	static int getRotationCount(int arr[]){

		int rotation = 0;

		for(int i=0; i<arr.length-1; i++){
		
			if(arr[i] > arr[arr.length-1]){
				rotation ++;
                 	}
		}
		return rotation;
		
	}

	 public static void main(String args[]){

                int arr[] = {100,110,40,70,80,90};

		System.out.println(getRotationCount(arr));
	 }
}

