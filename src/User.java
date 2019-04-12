
/**
 * This class defines a user and what variables need to be defined for a user.
 * 
 * @author Danie Stokell - C15491708
 */

public class User {

	private String firstName;
	private String lastName;

	public User() {

	}

	/*
	 * Constructor with details for a user.
	 */
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getter Method for first name
	public String getFirstName() {
		return firstName;
	}

	// Setter Method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter Method for lastName
	public String getlastName() {
		return lastName;
	}

	// Setter Method for lastName
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	// toString method for a User that displays all their details
	public String toString() {
		return "SampleUser [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}