import java.util.Arrays;

class Demo{
	public static void main(String[] args){

		int[] arr = {7,1,4,6,5};

		int s = 0;
		int e = arr.length-1;

		quickSort(arr,s,e);

		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int[] arr,int start, int end){

		if(start<end){
		int piot = partitions(arr,start,end);

		quickSort(arr,start,piot-1);
		quickSort(arr,piot+1,end);
		}
	}
	static int partitions(int[] arr,int  start, int end){
	
		int piot = arr[end];

		int i = start;

		for(int j=start; j<end; j++){

			if(arr[j]<piot){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;

		return i;
	}

}
