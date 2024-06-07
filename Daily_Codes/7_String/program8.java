/* Concept => when we compair two Strings it compairs there identityHashCodes not there content
 */


class StringDemo8 {
	public static void main(String args [] ){

		String str1 = "prasad";
		String str2 = "prasad";

		String str3 = new String("prasad");

		if(str1 == str2){ 				// Here the identityHashCodes of str1 & str2 are equal hence content in if block executed
			System.out.println("1 & 2 are equal");
		}
		else{
			System.out.println("1 & 2 are not equal");
		}

		if(str1 == str3){			// Here the identityHashCodes of str1 & str3 are different hence content in else block executed
                        System.out.println("1 & 3 are equal");
                }
                else{
                        System.out.println("1 & 3 are not equal");
                }
	}
}
