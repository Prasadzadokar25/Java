import java.io.*;

class Program11{
	public static void main(String args[]) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine();
		System.out.println(name);
		
		try{
			double age = Double.parseDouble(br.readLine());
			System.out.println(age);
		}
		catch(NumberFormatException e){
			System.out.println("Inter valid data");
		}
	}
}
