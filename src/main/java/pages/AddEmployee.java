package pages;

public class AddEmployee {
	private String firstName;
	private String lastName;
//	private String empID;
	public AddEmployee(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//this.empID = empID;
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
	
	
}
