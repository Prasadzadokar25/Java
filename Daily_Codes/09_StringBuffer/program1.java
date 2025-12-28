/* Concept => 1) writting String using StringBuffer
	      2) stringBuffer is mutable [ We can chenge the string in StringBuffer }
*/

class StringBuffer1 {
	public static void main(String args[]) {

		StringBuffer str1 = new StringBuffer ("Prasad");

		// StringBuffer str = "prasad";   error: we are trying to store String in StringBuffer

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		str1.append("Zadokar");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
