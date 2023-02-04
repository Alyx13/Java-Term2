/** 
 * This system maintains important health information about a patient.
 * Note: This class assumes values passed to the set methods are correct.
 * REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
 * @author Alexandre Valiquette
 * @version [1]
 */
public class MyHealthData {
	
	//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
	
	/**
	 * first name component for hospital system of MyHealthData.
	 */
	private String firstName;
	
	/**
	 * last name component for hospital system of MyHealthData.
	 */
	private String lastName;
	
	/**
	 * gender component for hospital system of MyHealthData.
	 */
	private String gender;
	
	/**
	 * birth year component for hospital system of MyHealthData.
	 */
	private int birthYear;
	
	/**
	 * current year component for hospital system of MyHealthData.
	 */
	private int currentYear;
	
	/**
	 * height component for hospital system of MyHealthData.
	 */
	private double height;
	
	/**
	 * weight component for hospital system of MyHealthData.
	 */
	private double weight;
	
	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
	//START CODE
	public MyHealthData(String firstName,String lastName,String gender,
			double height,double weight,int birthYear,int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	//END CODE
	//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 * Returns the first name for this MyHealthData.
	 * @return the first name for this MyHealthData.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name for this MyHealthData.
	 * @param fistName The first name for this MyHealthData.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns the last name for this MyHealthData.
	 * @return the last name for this MyHealthData.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name for this MyHealthData.
	 * @param lastName The last name for this MyHealthData.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the gender for this MyHealthData.
	 * @return the gender for this MyHealthData.
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender for this MyHealthData.
	 * @param gender The gender for this MyHealthData.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Returns the birth year for this MyHealthData.
	 * @return the birth year for this MyHealthData.
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	/**
	 * Sets the current year for this MyHealthData.
	 * @param currentYear The current year for this MyHealthData.
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	/**
	 * Returns the current year for this MyHealthData.
	 * @return the current year for this MyHealthData.
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	
	/**
	 * Sets the birth year for this MyHealthData.
	 * @param birthYear The birth year for this MyHealthData.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * Returns the height for this MyHealthData.
	 * @return the height for this MyHealthData.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets the height for this MyHealthData.
	 * @param height The height for this MyHealthData.
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Returns the weight for this MyHealthData.
	 * @return the weight for this MyHealthData.
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Sets the weight for this MyHealthData.
	 * @param weight The weight for this MyHealthData.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Computes the age for this MyHealthData, through calculations from the birthYear and currentYear.
	 * @return the age for this MyHealthData.
	 */
	public int getAge() {
		return getCurrentYear() - getBirthYear() ;
	}
	
	/**
	 * Computes the MaximumHeartRate for MyHealthData, from 220 minus the age of the patient.
	 * @return the MaximumHeartRate for this MyHealthData.
	 */
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}
	
	/**
	 * Computes the MinimumTargetHeartRate for MyHealthData, from 110 minus the age of the patient.
	 * @return the MinimumTargetHeartRate for this MyHealthData.
	 */
	public double getMinimumTargetHeartRate() {
		return getMaximumHeartRate() * 0.5;
	}
	
	/**
	 * Computes the MaximumTargetHeartRate for MyHealthData, from 187 minus the age of the patient.
	 * @return the MaximumTargetHeartRate for this MyHealthData.
	 */
	public double getMaximumTargetHeartRate() {
		return getMaximumHeartRate() * 0.85;
	}
	
	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	
	/**
	 * Computes the BMI for MyHealthData, this is done through calculations with a predefined integer and multiplications with height and weight.
	 * @return the BMI for this MyHealthData.
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}
	
	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	
	/**
	 * Returns all the data required for the patients and puts all the information into a String.
	 * @return displayMyHealthData, a String representation of this MyHealthData.
	 */
	public void displayMyhealthData() {
		//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
		   
		// START CODE
		System.out.printf("Fullname: " + getFirstName()+" "+ getLastName() + "%n"
				+ "Gender: " + getGender() + "%n"
				+ "Date of birth: " + getBirthYear() + "%n"
				+ "Height: " + getHeight() + "in" + "%n"
				+ "Weight: " + getWeight() + "lb" + "%n"
				+ "Age: " + getAge() + "%n"
				+ "BMI: " + getBMI() + "%n"
				+ "Maximum heart rate: " + getMaximumHeartRate() + "%n"
				+ "Mainimu target heart rate: " + getMinimumTargetHeartRate() + "%n"
				+ "Maximum target heart rate: " + getMaximumTargetHeartRate() + "%n");
		//END CODE
		
		//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
	    System.out.println("Normal:      between 18.5 and 24.9");
	    System.out.println("Overweight:  between 25 and 29.9");
	    System.out.println("Obese:       30 or greater");
	}
	
	

} // end of class MyHealthData
	


