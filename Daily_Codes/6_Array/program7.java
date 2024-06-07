// cocept : integer cache


class ArrayDemo7{
	public static void main(String[] args){

		int x = 10;
		int y = 10;
		int z = 10;
		int a = 20;

		System.out.println(System.identityHashCode(x));  // if intergr  between -128 to 127 have same identityHashCode that means thy
								 // are stored at same place 
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(a));
	}
}
