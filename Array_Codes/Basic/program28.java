// remove dublicate element in array


class Array28 {

	static void removeDublicateEle(int arr[]){

		int uniqElementArr[] = new int[arr.length];
		int index = 0;

		for(int i=0; i<arr.length; i++){

			int flag = 0;

			for(int j=0; j<i; j++){

				if(arr[i]==arr[j]){

					flag = 1;
					break;
				}
			}
			if(flag == 0){

				uniqElementArr[index] = arr[i];
				index++;
			}
		}
		for(int i=0; i<index; i++)
			System.out.print(uniqElementArr[i]+" ");

		System.out.println();
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,2,4,1};


		removeDublicateEle(arr);
		
	}
}
