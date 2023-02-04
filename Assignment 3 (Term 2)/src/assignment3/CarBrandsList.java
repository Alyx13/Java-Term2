package assignment3;
//22F Assignment 3: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document (please read before you start). Hints have been provided on your tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are codes inbetween the print statements (see assignment information).

//TO DO: YOUR TASK 1: Add the necessary import statements here.
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Alexandre Valiquette
 * @version [1]
 */

public class CarBrandsList {
	
    /**
     * @param args array of string arguments
     */ 
    public static void main(String[] args) {
    	
    	// add rides to list1
        String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
        
        // TO DO: YOUR TASK 2
        // Create a LinkedList from the rides array and store it in list1
        List<String> list = Arrays.asList(rides);
        LinkedList<String> list1 = new LinkedList<String>(list);
        
        // add rides2 to list2
        
        String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};

        // TO DO: YOUR TASK 3
        // Create a List object from the rides2 array
        list = Arrays.asList(rides2);
        // Create a LinkedList from the rides2 array and store it in list2
        LinkedList<String> list2 = new LinkedList<String>(list);

        // TASK 4
        // Add the elements of list2 to the end of list1
        list1.addAll(list2);
        // Print the elements of list1 to the console
        listOutput(list1);


        // TASK 7
        // Convert the elements of list1 to uppercase and print the updated list
        System.out.printf("%nThis is showing the Car Brands in uppercase letters...");
        for (int i = 0; i < list1.size(); i++) {
            list1.add(list1.size(), list1.getFirst().toUpperCase());
            // Remove the first element from list1
            list1.remove();
        }
        listOutput(list1);
   
        // TO DO: YOUR TASK 8
        // Remove the elements at positions 5 to 7 in list1 and print the updated list
        System.out.printf("%nDeleting car brands 5 to 7...");
        list1.subList(5, 8).clear();
        listOutput(list1);

        System.out.printf("%nHere is the current list of car brands...");
        listOutput(list1);

        // TO DO: YOUR TASK 9
        System.out.printf("%nReversed List:\n");
        reverse(list1);        

        // TO DO: YOUR TASK 10 
        System.out.printf("%nSorted car brands in alphabetical order...");
        list1.sort(null);
        listOutput(list1);

        // TO DO: YOUR TASK 11
        System.out.printf("%nRemoving duplicate car brands...\n");
        noDubplicates(list1);
    }


    /**
     * Method to reverse the elements of a given list.
     * @param list list whose elements are to be reversed.
     */
    public static void reverse(LinkedList<String> list) {
        String output = "";
        for(String object: list) {
            output = object + " " + output;
        }
        System.out.println(output);
    }


    /**
     * Method to print the elements of a list.
     * @param list list whose elements are to be printed.
     */
    public static void listOutput(LinkedList<String> list) {
        System.out.println("\nList is: ");
        for(String item: list) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

  
    /**
     * Method to print the non-duplicate elements of a list.
     * @param list list whose elements are to be printed.
     */
    public static void noDubplicates(LinkedList<String> list) {
        Set<String> hash = new HashSet<>();
        for(String v : list) {
            hash.add(v);
        }
        System.out.print("Non-duplicates are: ");
        for(String v: hash) {
            System.out.print(v + " ");
        }
    }
}