// Ceiling and floor of element


class Array24 {

	static void ceilingFloor(int arr[],int num){

		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<arr.length; i++){

			if(arr[i]<min)
				min = arr[i];

			if (arr[i]>max)
				max = arr[i];
		}

		int floor = min;
		int ceil = max;

		for(int j=0; j<arr.length; j++){

			if(arr[j]<=num && arr[j]>floor)	
				floor = arr[j];
		
			if(arr[j]>=num && arr[j]<ceil)
				ceil = arr[j];
		}
		if(num>max)
			ceil = -1;
		else if(num<min)
			floor = -1;
	
		System.out.println("floor = "+floor);
 		System.out.println("ceil = "+ceil);
	}

	public static void main(String args[]){

		int arr[] = {5,6,8,9,6,5,5,6};
		int x = 10;

		ceilingFloor(arr,x);
	}
}
