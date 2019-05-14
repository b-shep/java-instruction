package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import logic.Contact;

public class StreamDemoApp{

	public static void main(String[] args) {
		
		List<Contact> contacts = new ArrayList<>();
		
		System.out.println("\nAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH\n\n\n");
		
		contacts.add(new Contact("Mike Murach", null, "800-211-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		//filter uses predicate interface
		contacts.stream().filter(c -> c.getPhoneNumber() == null)
						 .forEach(c -> System.out.println(c.getName()));
		
	
		
		//filter using predicate interface and collect uses collector
		List<Contact> contactsNoPhone = contacts.stream()
										.filter(c -> c.getPhoneNumber() == null)
										.collect(Collectors.toList());
		System.out.println("There are " + contactsNoPhone.size() + " contacts with no phone");
		
		//transform a list using map method p. 719
		System.out.println("\ntransform w map");
		List<String> contactNames = contacts.stream()
											.map(Contact::getName)
											.collect(Collectors.toList());
		contactNames.stream()
					.forEach(System.out::println);
		
		//map-reduce operation pg. 721
		
		String csv = contacts.stream()
					.map(c -> c.getName())
					.reduce("", (a, b) -> a + b + ", ");
		csv = csv.substring(0, csv.length() - 2);
					System.out.println("csv = " + csv);
	
		//map-reduce w Math.max
		List<Double> invoices = new ArrayList();
		invoices.add(567.43);
		invoices.add(1234.56);
		invoices.add(45.12); 
	

	}
}
