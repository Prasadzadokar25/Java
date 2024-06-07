// Concept => StringBuffer can be append with String


class StringBuffer4 {
	public static void main (String args[]) {

		StringBuffer str1 = new StringBuffer("prasad");
		String str2 = "Zadokar";
		System.out.println("StringBuffer = "+str1);
		System.out.println("String = "+str2);

		StringBuffer str3 = str1.append(str2);     // Here at run time operation on string create new object atomaticaly
							   // hence not need to StringBuffer with 'new'
		System.out.println("combain string = "+str3);

		//String str4 = str2.append(str1);   here the append result is in StringBuffer form and we are trying to store it in string 
	}
}
