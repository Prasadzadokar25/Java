// secound laregest element


class Array6 {

	static int getSecoundMAxElement(int arr[]){

		int max = arr[0];
		int secoundMax = arr[0];

		for(int i=0; i<arr.length; i++){

			
			if(arr[i] > max){

				secoundMax = max;
				max = arr[i];
			}
			else if(arr[i] > secoundMax){
				secoundMax = arr[i];
			}
		}
		return secoundMax;		
	}

	public static void main(String args[]){

		int arr[] = {3,4,7,2,5,6};

		System.out.println("Secound max element = "+getSecoundMAxElement(arr));
	}
}

