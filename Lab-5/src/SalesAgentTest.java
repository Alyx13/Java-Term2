/** 
 * This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
 * @author Alexandre Valiquette
 * @version [1]
 */
public class SalesAgentTest {

	public static void main(String[] args) {
		
		System.out.println("Ouputs for SalesAgentTest");
		System.out.println();
		
		SalesAgent agent = new SalesAgent("Andrew", 42);
		SalesAgent supervisor = new SalesSupervisor("James", 26, "Perth");
		
		System.out.println(agent);
		System.out.println(supervisor);
		
		System.out.println();
		System.out.print("Made by Alexandre Valiquette");
	}

}
