// count number of element between two element


class Array43 {

	static int getElementCount(int arr[],int lowEle,int highEle){

		int count = 0;
		int flag = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] == highEle){
                                flag = 0;
                                break;
                        }

			if(flag == 1){
				count++;
			}
			if(arr[i] == lowEle){
				flag = 1;
			}
		}
		return count;
	}

	public static void main(String args[]){

		int arr[] = {3,2,1,4};
		int num1 = 2;
		int num2 = 4;

		System.out.println(" count of elements between "+num1+" and "+num2+" = "+getElementCount(arr,num1,num2));
	}
}
