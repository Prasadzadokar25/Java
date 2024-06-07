/* Take a day in week as and print its number using case
 */


class SwitchDemo4{
	public static void main(String[] args){

		String str = "Monday";

		switch (str){

			case "Monday" : System.out.println("1");
					break;
			case "Tuesday" : System.out.println("2");
					 break;
			case "Wedsday" : System.out.print("3");
					 break;
			default : System.out.println("No match");
				  break;
		}
	}
}
