/**
 * File name: Valiquette.java
 * @author [Alexandre Valiquette,ID#040998420]
 * Course: CST8284-OOP
 * Assignement: [Lab-1]
 * Date: [2022/09/22]
 * Professor: [Justin Martins]
 * Purpose: [This program will ask you 4 questions, 1 relation to your name
 * another one for your student#, and 2 reason for why you chose this program.
 * There is also an if statement to calculate the amount of weeks left until the 
 * end of our program and another statement that will compute the amount of months 
 * until the end of this term.]
 * Class list: [Valiquettte]
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Description:
 * @author Alexandre Valiquette
 * @version [1]
 */

public class Valiquette {
	
	/** 
	 * Main method:
	 * @since [jdk11.0.15_9]
	 * @param args Default Arguments
	 */

	public static void main(String[] args) {
	
		// keyboard scanner
		Scanner keyboard = new Scanner(System.in); 
	
		// variables used in this lab
		String name; // name
		Double studentNum; // student number
		String reason1; // reason 1 for taking this course
		String reason2; // reason 2 for taking this course
		int OPTION = 0; // option for if statement
		
		System.out.print("What is your name: ");
		name = keyboard.nextLine();
		
		System.out.print("What is your main reason for choosing this program: ");
		reason1 = keyboard.nextLine();
		
		System.out.print("What is your second reason for choosing this program: ");
		reason2 = keyboard.nextLine();
		
		System.out.print("What is your student number: ");
		studentNum = keyboard.nextDouble();
		
		if(studentNum%2==0)
		{
			LocalDate start = LocalDate.now();
		    LocalDate end = LocalDate.of(2024, Month.JUNE, 30);
			long weeks = ChronoUnit.WEEKS.between(start, end);
			System.out.println("Weeks remaining until program compeltion: "+(weeks-1));
		}
		
		else
		{
			Calendar month = Calendar.getInstance(); 
			System.out.println("Months remaining in the year: "+(12-month.get(Calendar.MONTH)+1)+" months");
		}
		
	}

}