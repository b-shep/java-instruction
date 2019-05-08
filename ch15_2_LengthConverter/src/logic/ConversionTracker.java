package logic;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class ConversionTracker {
	public ArrayList<Conversion> conversions = null;
	private Path conversionsPath = null;
	private File conversionsFile = null;
	private String SEP = "\t";
	

	public ConversionTracker() {
		conversionsPath = Paths.get("conversion_types.txt");
		conversionsFile = conversionsPath.toFile();
		conversions = getConversions();
		
	}


	public ArrayList<Conversion> getConversions() {
		if (conversions != null) {
			return conversions;
		}
		
		conversions = new ArrayList<>();
		if (Files.exists(conversionsPath)) {
			try (BufferedReader in = new BufferedReader(
									 new FileReader(conversionsFile))){
				
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(SEP);
					String fromUnit = fields[0];
					String toUnit = fields[1];
					double conversionFactor = Double.parseDouble(fields[2]);
					Conversion c = new Conversion(fromUnit, toUnit, conversionFactor);
					conversions.add(c);
					
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		return null;
	}
	
	public void addConversion() {
		
	}
	
	public boolean saveConversions(){
		try(PrintWriter out = new PrintWriter(
							  new  BufferedWriter(
							  new FileWriter(conversionsFile)))){
			for (Conversion c: conversions) {
				out.print(c.getFromUnit() + SEP);
				out.print(c.getToUnit() + SEP);
				out.println(c.getConversionFactor());
			}
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}

