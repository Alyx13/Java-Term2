/**
 * File name: Valiquette.java
 * @author [Alexandre Valiquette,ID#040998420]
 * Course: CST8284-OOP
 * Assignement: [Lab-2]
 * Date: [2022/09/30]
 * Professor: [Justin Martins]
 * Purpose: [This program will ask you 4 questions, 1 relation to your name
 * another one for your student#, and 2 reason for why you chose this program.
 * There is also an if statement to calculate the amount of weeks left until the 
 * end of our program and another statement that will compute the amount of months 
 * until the end of this term.]
 * Class list: [CovidStatistics]
 */
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Description:
 * @author Alexandre Valiquette
 * @version 1
 */

public class CovidStatistics
{
public static void main(String[] args)
 {
	int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, m7 = 0, m8 = 0; 
	
   // 2D array
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   // array
   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   
   
   System.out.println("              Month      Feb    March    April   May   June   July    Aug     Sept");
   System.out.println();
   
   // for loop
   for(int i = 0; i < patients.length; i++) {
	   
	   m1 += patients[i][0];
	   m2 += patients[i][1];
	   m3 += patients[i][2];
	   m4 += patients[i][3];
	   m5 += patients[i][4];
	   m6 += patients[i][5];
	   m7 += patients[i][6];
	   m8 += patients[i][7];
	   
	   System.out.printf("%20s", provinces[i]);
	   
	   // nested for loop
	   for(int j =0; j < patients[i].length; j++) {
		   
		   System.out.printf("%8d", patients[i][j]);
	   }
	   
	   System.out.printf("%n");
   }

     //  for(int i=0; i<patients.length; i++) {
	  //     for(int j=0; j<patients[i].length; j++) {
		//   System.out.printf(patients[i][j]+ " ");
	  //     }
	 //  System.out.printf("%n");
     //  }
   
   System.out.println();
   System.out.print("             Recovered Patients");
   
   // print report of total patients infected for each province
   System.out.printf("%7d%7d%7d%7d%7d%7d%7d%7d",m1,m2,m3,m4,m5,m6,m7,m8);
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}
}




   
   
   
   
   





