package logic;

public class Vendor {
	private int id;
	private String code;
	private String address;
	private String city;
	private String state;
	private String phoneNumber;
	
	
	
	
	public Vendor() {
		id = 0;
		code = "";
		address = "";
		city = "";
		state = "";
		phoneNumber = "";
		
	}

	public Vendor(int id, String code, String address, String city, String state, String phoneNumber) {
		super();
		this.id = id;
		this.code = code;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
