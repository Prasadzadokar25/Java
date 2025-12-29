import java.util.Scanner;
import arithfun.Addition;

class User1 {

	

	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
	       	
		System.out.println("**********Addition***********");
		
		System.out.print("Enter number1 = ");
		int x = sc.nextInt();


		System.out.print("Enter number2 = ");
                int y = sc.nextInt();

		Addition ad = new Addition(x,y);
		System.out.println("Sum = " + ad.add());

		/*System.out.println("**********Subtraction***********");

		Subtraction sd = new Subtraction(x,y);   // here we don't import Subtraction
                System.out.println("subtraction = " + sd.sub());
		*/
	}
}
