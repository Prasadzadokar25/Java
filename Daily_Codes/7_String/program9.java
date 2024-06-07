// Concept => Joining two string


class StringDemo9 {
	public static void main (String args[]) {

		String str1 = "prasad";
		String str2 = "zadokar";

		String str3 =  str1+str2;    //when we add two string it call 'append' method of StringBuilder class which join the given String
		String str4 = str1.concat(str2);

		System.out.println(str3);
		System.out.println(str4);
	}
}
