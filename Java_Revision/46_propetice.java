import java.util.*;
import java.io.*;

class Client {

	public static void main(String args[]) throws Exception{ 

		Properties pro = new Properties();

		FileInputStream file = new FileInputStream("prasad.properties");
		
		pro.load(file);

		System.out.println(pro.getProperty("a"));

		pro.setProperty("c","50");
		System.out.println(pro.getProperty("c"));
	}
}
