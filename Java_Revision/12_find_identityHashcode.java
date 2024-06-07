class Program12{
	public static void main(String[] args){

		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};

		System.out.println(arr1);
		System.out.println(arr2);

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr2[0]));
	}
}
