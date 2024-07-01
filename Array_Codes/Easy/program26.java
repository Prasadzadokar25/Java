// find leader
// print element in the array which is greater than all its right side elements


class Array26 {

	static void getLeaders(int arr[]){

		int leaderArray[] = new int[arr.length];
		int index = 0;

		for(int i=0; i<arr.length-1; i++){

			int flag = 0;
			for(int j=i+1; j<arr.length; j++){

				if(arr[i]<arr[j]){

					flag = 1;
				}		
			}
			if(flag == 0){
				leaderArray[index] = arr[i];
				index++;
			}
		}
		leaderArray[index] = arr[arr.length-1];

		for(int i=0;i<=index; i++){
			System.out.print(leaderArray[i]+" ");
		}
		System.out.println();
	}

	public static void main(String args[]){

		int arr[] = {16,17,4,3,5,2};

		System.out.println("element in the array which is greater than all its right side elements");
		getLeaders(arr);
	}
}
