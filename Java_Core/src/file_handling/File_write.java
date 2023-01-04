package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write {

	public static void main(String[] args) {
		
		//File creation
		try {
		      File myfile = new File("file.txt");
		      if (myfile.createNewFile()) {
		        System.out.println("File created: " + myfile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		//Writing to a file

		try {
            FileWriter writer = new FileWriter("file.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("My name is Kaushik");
            bufferedWriter.newLine();
            bufferedWriter.write("This is ISS assignment!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
