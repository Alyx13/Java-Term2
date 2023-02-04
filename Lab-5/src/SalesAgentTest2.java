/** 
 * This program is the second test for the SalesAgent class including the subclasses.
 * @author Alexandre Valiquette
 * @version [1]
 */
public class SalesAgentTest2 {

	public static void main(String[] args) {
		
		System.out.println("Ouputs for SalesAgentTest2");
		System.out.println();
		
		SalesAgent agent1 = new SalesAgent("Peter", 56);
		SalesAgent agent2 = new SalesAgent("John", 48);
		SalesSupervisor supervisor = new SalesSupervisor("Ifeoma", 53, "Toronto");
		SalesChief chief = new SalesChief("Alex", 20, "Ottawa", "Sales Chief");
		
		System.out.println(agent1);
		System.out.println(agent2);
		System.out.println(supervisor);
		System.out.println(chief);
		
		System.out.println();
		System.out.print("Made by Alexandre Valiquette");
	}

}
