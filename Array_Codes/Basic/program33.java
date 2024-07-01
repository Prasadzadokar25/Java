// multiplication of left right element sum


class Array33 {

	static int mulLeftRigthArraySum(int arr[]){

		int leftSum = 0;
		int rightSum = 0;

		for(int i=0; i<arr.length; i++){

			if(i<arr.length/2){
				leftSum += arr[i];
			}
			else {
				rightSum += arr[i];
			}
		}
		return leftSum*rightSum;
	}

	public static void main(String args[]){

		int arr[] = {5,4,3,1};

		System.out.println("multiplication of left right arraysum = "+mulLeftRigthArraySum(arr));
	}
}
