import java.util.Scanner;
/** 
 * This class is used for entering the patients data, it will then send that data back to the object. Once MyHealthData.java has
 * done all the calculations, it will display them trough the use of a report that we created using the displayMyHealthData(). 
 * @author Alexandre Valiquette
 * @version [1]
 */
public class MyHealthDataTest {

	public static void main(String[] args) {
		
		//variables used
		Scanner keyboard = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String gender;
		
		int birthYear;
		int currentYear = 2022;
		
		double height;
		double weight;
		
		System.out.print("Enter Firstname: ");
		firstName = keyboard.nextLine();
		
		System.out.print("Enter Lastname: ");
		lastName = keyboard.nextLine();
		
		System.out.print("Enter Gender: ");
		gender = keyboard.nextLine();
		
		System.out.print("Enter Year of Birth: ");
		birthYear = keyboard.nextInt();
		
		System.out.print("Enter Height (in inches): ");
		height = keyboard.nextDouble();
		
		System.out.print("Enter weight (in pounds): ");
		weight = keyboard.nextDouble();
		
		MyHealthData patient = new MyHealthData(firstName, lastName, gender, height, weight,birthYear, currentYear);
		patient.displayMyhealthData();
		
		System.out.println();
	}

}
