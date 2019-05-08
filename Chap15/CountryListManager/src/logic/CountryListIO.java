package logic;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountryListIO {
	private ArrayList<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;
	private String SEP = "\n";
	
	
	public CountryListIO(){
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = getCountries();
		
	}

	
	public ArrayList<String> getCountries(){
		if(countries != null) {
			System.out.println("countries returned");
			return countries;
		}
		
		countries = new ArrayList<>();
		try (BufferedReader in = 	new BufferedReader(
									new FileReader(countriesFile))){
			String line = in.readLine();
			while(line != null) {
				countries.add(line);
				line = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return countries;
	}
	
	
	public boolean saveCountries() {
		
		try (PrintWriter out = 	new PrintWriter(
								new BufferedWriter(
								new FileWriter(countriesFile)))) {
		
			for (String country: countries) {
				out.print(country + SEP);
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}


	public void add(String string) {
		countries.add(string);
		
	}
	
}
