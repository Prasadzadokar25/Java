// even occuring elements

class Array8 {

	public static void main(String args[]) {

		int noCount = 0;

		int arr[] = {9,12,23,10,12,12,15,23,14,12,15};

		for(int i=0;i<arr.length; i++){

			int count = 1;
			int flag = 0;

			for(int j = 0; j<i; j++){

				if(arr[i] == arr[j]){

					flag = 1;
					break;
				}
			}
			if(flag == 0){

				count = 0;
				for(int j = 0;j<arr.length;j++){

					if(arr[i] == arr[j]){

						count++;
					}
				}	
			}
			if(count%2 == 0){

				System.out.println(arr[i]);
				noCount++;
			}
		}
		if(noCount == 0){

			System.out.println(-1);
		}		
	}
} 
