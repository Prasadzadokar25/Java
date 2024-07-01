// find first non repeating element


class Array21 {

	static int getNonRepeatingElement(int arr[]){

		for(int i=0; i<arr.length; i++){

			int flag = 0;

			for(int j=0; j<arr.length; j++){

				if(arr[j] == arr[i] && i!=j ){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				return arr[i];

			}
		}
		return -1;
	}
	public static void main(String args[]){

		int arr[] = {-1,2,-1,3,2};

		System.out.println(getNonRepeatingElement(arr));
	}
}
