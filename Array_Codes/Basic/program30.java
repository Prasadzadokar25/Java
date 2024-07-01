// find closest element


class Array30 {

	static int closestElement(int arr[],int num){
		
		int min = arr[0];
		int max = arr[0];
		int closestEle = 0;

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
		
		if(num-floor > ceil-num){

			closestEle = floor;
		}
		else{
			closestEle = ceil;
		}
		return closestEle ;
	}

	public static void main(String args[]){

		int arr[] = {5,4,6,1,2,6};
		int x = 3;

		System.out.println("closest element of "+x+" is "+closestElement(arr,x));
	}
}
