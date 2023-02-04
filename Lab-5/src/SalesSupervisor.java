/** 
 * This class shows a Sales Supervisor with location, this class inherits the name and age 
 * from SalesAgent class.
 * @author Alexandre Valiquette
 * @version [1]
 */
class SalesSupervisor extends SalesAgent {
	
	/**
	 * location component for the SalesSupervisor.
	 */
	private String location;
	
	// constructor
	public SalesSupervisor(String name, int age, String location) {
		super(name, age);
		this.location = location;	
	}
	
	/**
	 * Returns the location for this SalesSupervisor.
	 * @return the location for this SalesSupervisor.
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * This portion of the code returns a string representation of the SalesSupervisor.
	 * @return a string representation of the SalesSupervisor.
	 */
	public String toString() {
		return "Sales Supervisor [super=Sales Agent [name=" + getName() + ",age=" + getAge() + "],location=" + location + "]";
	}


}
