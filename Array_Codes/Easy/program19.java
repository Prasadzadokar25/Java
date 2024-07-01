// find element in array having all its left side element smaller and right side element are greater


class Array19 {

	static int getElementLSRG(int arr[]){

		for(int i=1; i<arr.length-1; i++){
			
			int flag1 = 0;
			int flag2 = 0;

			for(int j=0; j<i; j++){
				if(arr[j] > arr[i]){
					flag1 = 1;
					break;
				}
			}
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[i]){
					flag2 = 1;
					break;
				}
			}
	
			if(flag1 == 0 && flag2 == 0){
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String args[]){

		int arr[] = {4,2,5,7};

		System.out.println(getElementLSRG(arr));
	}
}
