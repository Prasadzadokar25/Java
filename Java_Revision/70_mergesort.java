import java.util.*;
class Demo{

	public static void main(String[] args){

		int[] arr = {3,2,5,4,1,6,4};

		int start = 0;
		int end = arr.length-1;

		mergeSort(arr,start,end);
		System.out.println(Arrays.toString(arr));
	}

	static void mergeSort(int[] arr,int start,int end){

		if(start<end){
			int mid = (start+end)/2;

			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);

			mergeArr(arr,start,mid,end);
		}
	}
	static void mergeArr(int[] arr,int start,int mid,int end){

		int n1 = mid-start+1;
		int n2 = end - mid;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for(int i=0; i<n1; i++){
			arr1[i] = arr[start + i];
		}
		for(int i=0; i<n2; i++){
			arr2[i] = arr[mid+i+1];
		}

		int x=0;
		int y=0;
		int index=start;

		while(x<n1 && y<n2){

			if(arr1[x]<arr2[y]){
				arr[index] = arr1[x];
				x++;
			}else{
				arr[index] = arr2[y];
				y++;
			}
			index++;
		}

		while(x<n1){
			arr[index] = arr1[x];
                        x++;
			index++;
		}
		while(y<n2){
                        arr[index] = arr2[y];
                        y++;
                        index++;
                }
	}

}
