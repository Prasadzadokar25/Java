/* concept => Different ways of writting String 
    	
   	1. Using variable without new
	2. using variable with new
	3. using charecter array
*/

class StringDemo1{
	public static void main(String args [] ){

		String str1 = "Prasad ";               // Get memory onSCP
		String str2 = new String ("Rohit ");   // Get memory on HEAP
		char str3[] = {'o','m'};	       // Get memory on HEAP

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
