package ui;

import java.io.*;
import java.nio.file.*;

public class fileDemoApp {

	public static void main(String[] args) {
		System.out.println("hello!");
		
		try {
			//define a folder on the hard drive
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
					Files.createDirectories(dirPath);
					System.out.println("Directory Created.");
			} else {
					System.out.println("Directory Aleady Exists.");
			}
			//define a file w/in folder
			String fileString = "products.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
				System.out.println(fileString + " successfully created.");
			} else {
				System.out.println(fileString + " already exists.");
			}
			System.out.println("File Name: " + filePath.getFileName());
			System.out.println("Absolute path: " + filePath.toAbsolutePath());
			System.out.println("Is writable: " + Files.isWritable(filePath));
			System.out.println("Relative path: ");
			//print files in a directory
			System.out.println("Files in a directory: ");
			if(Files.exists(dirPath) && Files.isDirectory(dirPath)) {
				System.out.println("Directory: " + dirPath.toAbsolutePath());
				System.out.println("Files: ");
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p: dirStream) {
					if(Files.isRegularFile(p)) {
						System.out.println("\t" + p.getFileName());
					}
				}
			}
			//write to the file
			Path productsPath = Paths.get("Products.txt"); //not the same products.txt as above example
			File productsFile = productsPath.toFile();
			
			//open an output stream
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
					new FileWriter(productsFile)));
			//write data to the screen
			out.println("java\tMurach's Java Programming\t57.50");
			
			//close stream to avoid resource leak
			out.close();
			
			//open input stream 
			BufferedReader in = new BufferedReader(
					new FileReader(productsFile));
			
			//read data from stream and print to console
			String line = in.readLine();
			System.out.println(line);
			
			in.close();
			
			//bonus instruction: map this line to a product instance
			String[] fields = line.split("\t");
			String code = fields[0];
			String desc = fields[1];
			Double price = Double.parseDouble(fields[2]);
			
			Product p = new Product(code, desc, price);
			System.out.println(p);
			
		} catch (IOException e) {
			System.out.println("Bad Directory Path Entered.");
			e.printStackTrace();
	
		}
	}
}
 