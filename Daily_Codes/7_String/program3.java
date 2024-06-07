// Concept => Different behavior of charecter array while printing


class StringDemo3 {
	public static void main(String args[]){

		char arr[] = {'p','r','a','s','a','d'};

		System.out.println(arr);             // Here arr act as charecter array
		System.out.println("Array = " +arr);  /* here arr act as string becouse is come with string and when 
							 arr act as string it call to string method and written it's address*/

		System.out.println(arr.toString());

	}
}
