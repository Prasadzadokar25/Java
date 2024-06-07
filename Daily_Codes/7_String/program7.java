/* Concept => concat method create new object on HEAP hence string crated by concat has
 	      different identityHashCode  */


class StringDemo7 {
	public static void main(String args[]){

		String str1 = "prasad";
		String str2 = "Zadokar";

		System.out.println((str1));
		System.out.println(System.identityHashCode(str1));

		System.out.println((str2));
		System.out.println(System.identityHashCode(str2));

		String str3 = str1.concat(str2);
		System.out.println((str3));
		System.out.println(System.identityHashCode(str3));
	}
}
