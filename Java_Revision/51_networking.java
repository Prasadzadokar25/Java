import java.net.*;
import java.io.*;
import java.awt.*;


class Client{
	public static void main(String args[]){

	try{
		
		String url = "https://www.youtube.com/";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
	}
	catch(Exception e){

		System.out.println("error occurs"+e);
	}
	}
}
