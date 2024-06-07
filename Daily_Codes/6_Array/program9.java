//cocept : Passing array as an argument


class ArrayDemo9{

	static void fun( int arr[]){

		for(int x : arr){
			arr[0] = 50;
			}
		}
        public static void main(String[] args){
		 
		int arr1[] = {10,20,30,40};

		System.out.println("intial element in array");
		for(int y : arr1){
			 System.out.println (y);
		}
		fun(arr1);
		System.out.println("elment after function call");

		for(int y : arr1){
                         System.out.println (y);
		}
	}
}
