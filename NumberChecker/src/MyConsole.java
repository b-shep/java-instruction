
public class MyConsole extends Console{

	
    public String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();  // read user entry
        return s;
    }
    
    public String getString(String prompt, String notAllowed) {
    	String s = notAllowed;
    	boolean isValid = false;
    	
    	while(!isValid) {
    		s = getString(prompt);
    		if (s.equalsIgnoreCase(notAllowed)) {
    			System.out.println("Entry Required!");
    		} else {
    			isValid = true;
    		}
    		
    	}
    	
    	return s;
    }
	
	
	
	
	
}
