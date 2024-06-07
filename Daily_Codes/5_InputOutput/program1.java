/* Input by scanner
 */

import java.util.Scanner;

class InputDemo1{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your dream company name");
		String str = sc.next();

		System.out.println("Enter your salary ");
		float salary = sc.nextFloat();

		System.out.println("Name = "+str);
		System.out.println("salary = "+salary);
	}
}
