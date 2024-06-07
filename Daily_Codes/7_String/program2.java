/* Concept => For every 'new' keyword  new object is create on HEAP
 */

class StringDemo2 {
	public static void main (String args[]){

		String str1 = "prasad";  // identityHashCode for str1 and str2 is same becouse content in both string is same and they created without 'new 
		String str2 = "prasad";

		String str3 = new String("prasad");// identityHashCode for str1 and str2 is diffrent becouse even if they have same content but they are created with 'new' keyword
		String str4 = new String("prasad");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}
}
