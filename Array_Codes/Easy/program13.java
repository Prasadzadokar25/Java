// minimun distance between two element


class Array13 {

	static int getMinDistance(int arr[], int num1, int num2){

		int minDistance = -1;

		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr.length; j++){

				if(arr[i] == num1 && arr[j] == num2){
					if(j>i){
						minDistance = j-i;
					}else{
						minDistance = i-j;
					}
				}
			}
		}
		return minDistance;
	}
	public static void main(String args[]){

		int arr[] = {2,3,4,3,2,7};
		int num1 = 2;
		int num2 = 4;

		System.out.println(getMinDistance(arr,num1,num2));
	}
}
