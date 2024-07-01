// get count of buildings facing sun light


class Array24 {

	public static void main(String args[]){

		int arr[] ={2,3,4,5};

		int maxHight = arr[0];
		int count = 1;    // since first building always face sun light

		for(int i=1; i<arr.length; i++){

			if(arr[i] > maxHight){

				count++;
				maxHight = arr[i];
			}
		}
		System.out.println(count);
	}
}
