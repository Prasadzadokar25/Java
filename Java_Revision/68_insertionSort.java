import java.util.Arrays;
class Demo{
	public static void main(String[] args){

		int[] arr = {2,4,1,3,5};

		for(int i=1; i<arr.length; i++){

			int element = arr[i];
			int j = i-1;

			for(; j>=0&&arr[j]>element; j--){

				
					arr[j+1]=arr[j];
				
			}
			arr[j+1] = element;
		}
		System.out.println(Arrays.toString(arr));
	}
}
