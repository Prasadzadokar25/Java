// immediate smalller element


class Array38 {

	static void immediateSmallElement(int arr[]){

		for(int i=0; i<arr.length; i++){

			if(i==arr.length-1 || (arr[i+1]>arr[i])){
				arr[i]=-1;
			}
			else {
				arr[i]=arr[i+1];
			}
		}
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String args[]){

		int arr[] = {4,2,1,5,3};

		immediateSmallElement(arr);
	}
}
