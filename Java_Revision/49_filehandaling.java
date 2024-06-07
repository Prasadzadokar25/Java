import java.io.*;
import java.io.IOException;
 class Client {
    public static void main(String[] args) throws IOException{
        // Specify the file path
        String filePath = "zz.txt";

        try {
            // Step 1: Create a FileWriter object
            FileWriter writer = new FileWriter(filePath,true);

            // Step 2: Open the file for writing

            // Step 3: Write data to the file
            writer.write("Hello, this is a test.\n");
            writer.write("This is another line.");

            // Step 4: Close the file
            writer.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

	FileReader fileR = new FileReader(filePath);

	int data = fileR.read();

	while(data!=-1){

		System.out.print((char)data);
		data = fileR.read();
	}
	System.out.println();
	fileR.close();
    }
}

