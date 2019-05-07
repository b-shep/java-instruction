package ui;
import logic.Book;
import logic.Product;

public class ProjectDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		Product p1 = new Product("java", "Murach's Java", 55.50);
		Product p2 = new Product("java", "Murach's Java", 53.50);
		
		System.out.println(p1.getCode() + " " + p1.getDescription() +  " " + p1.getPrice());
		System.out.println(p1.toString());
		
		Product.aStaticMethod();
		
		//create a book
		Book bensBook = new Book("java", "Murach's", 57.50, "Joel Murach");
		System.out.println(bensBook);
	
	}


}
