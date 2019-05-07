import java.util.ArrayList;

public class CountryListManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Country List Manager");
		System.out.println("COMMAND MENU:\n1 - List Countries\n2 - Add a country\n3 - Exit");
		
		
		String cont = "yes";
		do {
			CountryListIO edit = new CountryListIO();
			String choice = Console.getString("Enter menu number: ", "1", "2", "3");
			if(choice.equals("1")) {
				System.out.println(edit.getCountries());
			} else if(choice.equals("2")) {
				ArrayList<String> newCountry = new ArrayList<>();
				newCountry.add(Console.getString("Enter Country: "));
				edit.saveCountries(newCountry);
				
			} else if(choice.equals("3")) {
				cont = "no";
			}
			
		} while(cont.equals("yes"));
	}

}
