class Program15{
	public static void main(String[] args){

		int[] arr1 = {10,200};

		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[1]));

		String str = "prasad";
		StringBuffer str2 = new StringBuffer(str);
		str = str2.reverse().toString();
		System.out.println(str);
	}
}
