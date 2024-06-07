/* concept  :  error ( variable expression )
		[ costant expression required ]
*/


class SwitchDemo3{
	public static void main(String [] args){

		int x = 5;
		int a = 1;
		int b = 2;

		switch(x){

			case a : System.out.println(" 1 ");  // error ( costant variable required )
				 break;
			case b : System.out.println(" 2 ");  // error ( costant variable required )
				 break;
			default : System.out.println("Default");
				  break;
		}System.out.println("After Switch");
	}
}
