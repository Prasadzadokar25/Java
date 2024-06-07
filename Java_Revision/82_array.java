class Demo{
	public static void main(String[] args){
		int[] bags = {100, 100, 100, 100, 100, 100, 100, 100, 99, 100};
		

		int[] psArr = new int[bags.length];

		psArr[0] = bags[0];

		for(int i=1; i<bags.length; i++){

			psArr[i] = psArr[i-1] + bags[i];
		}

		int start = 0;
		int end = bags.length-1;
		int mid = 0;


		while(start<end){

			 mid = start+(end-start)/2;

			int leftW = 0;
			int rightW =0;

			if(start ==0){
				leftW = psArr[mid];
			}else{
				leftW = psArr[mid] - psArr[start-1];
			}

			rightW = psArr[end] - psArr[mid];

			if(leftW<rightW){
				end = mid;
			}else{
				start = mid+1;
			}
			System.out.println(mid);
		}
		System.out.println(mid+1+"*******");
	}
}
			
