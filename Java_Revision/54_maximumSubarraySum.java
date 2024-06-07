class Demo{
	public static void main(String[] args){

		int[] arr = {1,2,-1,1};

		int max = Integer.MIN_VALUE;
		int sum = 0;
		int s = 0;
		int e = 0;

		for(int i=0; i<arr.length; i++){

			sum = sum + arr[i];

			if(sum>max){
				max = sum;
				e = i;
			}
			if(sum<0){
				sum = 0;
				s=i;
			}
		}
		System.out.println(max);

		for(int i=s; i<=e; i++){
			System.out.print(arr[i] +" ");
		}
	}
}
