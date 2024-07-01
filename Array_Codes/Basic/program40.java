// count fibonacci numbers present in the array
// fibonacci number = 0,1,1,2,3,5,8,13,21,34....


class Array40 {

	static int getFibonacciNumCount(int arr[]){
	
		int max = arr[0];
		int count = 0;

		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int preAdd = 0;
		
		for(int j=0; j<arr.length; j++){
				
			int add = 1;
			for(int i=1; i<=max; ){

				if(arr[j]==i){
					count++;
				}
				preAdd = i;
				i+=add;
				add=preAdd;
			}
			if(arr[j]==0)
				count++;
		}

		return count;
	}

	public static void main(String args[]){

		int arr[] = {2,4,8,5,20,1,0,40,13,23};

		System.out.println("count of fibonacci number imn array = "+getFibonacciNumCount(arr));
	}
}
