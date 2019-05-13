package ui;

import java.util.ArrayList;
import java.util.List;

import logic.Contact;
import logic.TestContact;

public class ContactsApp {

	public static void main(String[] args) {
		
		List<Contact> contacts = new ArrayList<>();
		
		System.out.println("\nAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH\n\n\n");
		
		contacts.add(new Contact("Mike Murach", null, "800-211-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		
		for (Contact c: contacts) {
			if(c.getEmail() == null) {
			contactsWithoutEmail.add(c);
			}
		}
		
		System.out.println("Contacts with no email (no lamda): ");
		for (Contact c: contactsWithoutEmail) {
			System.out.println(c.toString());
		}
		
		System.out.println("Contacts with no email (no lamda): ");
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		
		for (Contact c: contacts) {
			if(c.getPhoneNumber() == null) {
			contactsWithoutPhone.add(c);
			}
		}
		
		
		System.out.println("Lamda");
		System.out.println("wout phone");
		contactsWithoutPhone = filterContacts(contacts,
				c -> c.getPhoneNumber()==null);
		
		for(Contact c: contactsWithoutPhone) {
			System.out.println(c);
		}
		
	System.out.println("wout email");
		
		contactsWithoutEmail = filterContacts(contacts,
				c -> c.getEmail()==null);
		
		for(Contact c: contactsWithoutEmail){
			System.out.println(c);
		}


	}
	
	private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition){
		List<Contact> filterContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filterContacts.add(c);
			}
		}
		return filterContacts;
	}

}
