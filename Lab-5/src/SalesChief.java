/** 
 * This class shows a SalesCheif with a department, this class inherits the 
 * location from the SalesSupervisor. It also inherits the name and age from SalesAgent class.
 * @author Alexandre Valiquette
 * @version [1]
 */
class SalesChief extends SalesSupervisor {
	
	/**
	 * department component for the SalesChief.
	 */
	private String department;
	
	// constructor 
	public SalesChief(String name, int age, String location, String department) {
		super(name, age, location);
		this.department = department;
	}

	/**
	 * This portion of the code returns a string representation of the SalesChief.
	 * @return a string representation of the SalesChief.
	 */
	public String toString() {
		return "Sales Chief [super=Sales Supervisor [super=Sales Agent [name=" + getName() + ",age=" + getAge() + "],location=" + getLocation() + "],department=" + department + "]";
	}


}
