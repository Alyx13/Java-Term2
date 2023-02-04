
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

abstract public class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;


//three-argument constructor
public Programmer(String first, String last, String ssn) {
 this.firstName = first;
 this.lastName = last;
 this.socialSecurityNumber = ssn;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/

// getter for first name
public String getFirstName() {
	return firstName;
}

//getter for last name
public String getLastName() {
	return lastName;	
}


public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

//return String representation of Programmer object
@Override
public String toString() {
return String.format("%s %s \n%s: %s\n%s: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 

//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??

public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


