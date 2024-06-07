/*Concept => Even if charecter internaly stored as intiger but at the time of printing identityHashCode 
 *           two diffrent identityHashCodes are print this is becouse when we print identityHashCode 
 *           there is call to 'value of' method which create new object
 */
 
class StringDemo4 {
	public static void main(String prasad[]){

		char ch = 'A';
		int x = 65;

		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(x));
	}
}
