package lib;

public class User {
    private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

    public User(String firstName, String lastName, String idNumber, String address) {
        setFirstName(firstName);
        setLastName(lastName);
        setIdnumber(idNumber);
        setAddress(address);
    }

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setIdnumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

}
