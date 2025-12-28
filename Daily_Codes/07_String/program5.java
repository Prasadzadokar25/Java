//Concept => printing identityHashCode for Strings

class StringDemo5{
	public static void main(String args []){

		String str1 = "prasad";   // since str1 $ str2 both has same content and they are created without new, they has same identityHashCode
		String str2 = str1;		
		String str3 = new String(str2); // here str3 created using new hence it have diffrent identityHashCode

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
