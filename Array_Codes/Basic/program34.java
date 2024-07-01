// pendulum arrangement


class Array34 {

	static void pendulumArrangment(int arr[]){
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0;j<arr.length-1; j++){

				if(arr[j+1]<arr[j]){
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int newArray[] = new int[arr.length];
		int n = 0;

		if(arr.length%2 != 0){

			newArray[(arr.length-1)/2]=arr[0];
			n=arr.length-1;
		}
		else{
			newArray[(arr.length)/2]=arr[0];
			n=arr.length;
		}
		int index = 1;

		for(int i=1; i<=n/2; i++){

			if(n/2+i < arr.length){
				newArray[(n/2)+i] = arr[index++];
			}
			newArray[(n/2)-i] = arr[index++];
		}

		for(int num:newArray){

			System.out.print(num+" ");
		}
		System.out.println();
		
	}

		

	public static void main(String args[]){

		int arr[] = {4,5,2,1,3};

		pendulumArrangment(arr);
	}
}
