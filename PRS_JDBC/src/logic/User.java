package logic;

public class User {
	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private boolean isReviewer;
	private boolean isAdmin;

	public User() {
		id = 0;
		userName = "";
		password = "";
		firstName = "";
		lastName = "";
		email = "";
		isReviewer = false;
		isAdmin = false;
	}
	public User(int id, String userName, String password, String firstName, String lastName, String email,
			boolean isReviewer, boolean isAdmin) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isReviewer() {
		return isReviewer;
	}
	
	public void setReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	

}
