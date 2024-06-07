/* Concept => printing HashCode of String
 
            Note = identityHashCode and HashCode are diffrent concepts
            	    HashCode of two string are same if there content is same doesn't matter how thay created
 */


class StringDemo10 {
	public static void main(String args[]) {

		String str1 = "prasad";
		String str2 = new String ("prasad");  // content of str1,str2 & str3 is equal hence they all have same HashCode
		String str3 = "prasad";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
}
