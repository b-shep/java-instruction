package logic;

public class Conversion {
	private String fromUnit;
	private String toUnit;
	private double fromValue;
	private double toValue;
	private double conversionFactor;
	
	public Conversion(String fromUnit, String toUnit, double conversionFactor) {
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.conversionFactor = conversionFactor;
	}
	
	
	public String getFromUnit() {
		return fromUnit;
	}


	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}


	public String getToUnit() {
		return toUnit;
	}


	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}


	public double getFromValue() {
		return fromValue;
	}


	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}
	
	public double getConversionFactor() {
		return conversionFactor;
	}


	public String calculate() {
		toValue = fromValue * conversionFactor;
		return formattedString();
	}
	
	public String formattedString() {
		String formatted = fromValue + " " + fromUnit + " is " + toValue + " " + toUnit;
		return formatted;
	}
	
}
