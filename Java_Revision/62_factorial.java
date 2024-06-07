class Demo{

	static String reverse(String str){

		if(str.length() == 1){
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args){

		String name = "prasad";

		System.out.println(reverse(name));

		int[] arr = {10};
		int[] arr2 = arr;

		arr2[0] = 20;

		System.out.println(arr[0]);
		                System.out.println(arr2[0]);
	}
}
