/* Input by BufferedReader
 */


import java.io.*;
class InputDemo2{

	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println(" Enter name");
		String name = br.readLine();

		System.out.print(" Enter age ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Name = "+name);
		System.out.println("age = "+age);
	}
}
