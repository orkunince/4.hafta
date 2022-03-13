package Entities;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String birthdate;
	private String nationaltyId;
	
	public User() {
	}
	public User(int id, String firstName, String lastName, String birthdate, String nationaltyId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.nationaltyId = nationaltyId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	

}
