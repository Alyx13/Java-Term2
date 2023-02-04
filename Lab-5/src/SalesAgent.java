// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/** 
 * This class shows a Sales Agent with a name and age.
 * @author Alexandre Valiquette
 * @version [1]
 */

public class SalesAgent {
	/**
	 * last name component for hospital system of MyHealthData.
	 */
   private String name;
   private int age;


   // START CODE
   
   // constructor
   public SalesAgent(String name, int age) {
	   this.name = name;
	   this.age = age;
   }
   
   // getter for name
   public String getName() {
	   return name;
   }
   
   // getter for age
   public int getAge() {
	   return age;
   }
   // END CODE

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
}