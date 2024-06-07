import java.util.Arrays;
class Demo{
	public static void main(String[] args){

		int[] arr = {10,20,30,40};

		int[] psArr = new int[arr.length];

		psArr[0] = arr[0];

		for(int i=1; i<arr.length; i++){
			psArr[i] = psArr[i-1] + arr[i];
		}
		System.out.println(Arrays.toString(psArr));

		for(int i=0;i<arr.length;i++){

			for(int j=i; j<arr.length; j++){
				
				if(i==0){
					System.out.println(psArr[j]);
				}else{
					System.out.println(psArr[j] - psArr[i-1]);
				}
			}
		}
	}
}

