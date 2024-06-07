/* Concept => when string is update at run time there is call to 'newString' hence the updated
 * 	      string create new object on HEAP which has different identityHashCode than SCP string
 */


class StringDemo6{
	public static void main (String args[]){

		String str1 = "prasad";
		String str2 = "zadokar";
		String str3 = "prasadzadokar";
		String str4 = str1 + str2;     /* even if str4 have same content as str3 it have diffrent 
						  identityHashCode than str3 becouse str4 updated at runtime */

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
