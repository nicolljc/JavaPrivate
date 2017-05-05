// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String[] args)
   {
      // TASK #2 Create a Scanner object here
	  Scanner keyboard = new Scanner(System.in);
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
	  String firstName;
	  String lastName;
	  String fullName;
      // TASK #3 declare variables used here
	  char firstInitial;
      // TASK #4 declare variables used here
	  double d;
	  double r;
	  double v;

      // Find an arithmetic average.
      average = ((SCORE1 + SCORE2) / NUMBER);
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5 * (BOILING_IN_F - 32)/9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
	  System.out.print("Enter your first name: ");
      // Read the user's first name
	  firstName = keyboard.nextLine();
      // Prompt the user for last name
	  System.out.print("Enter your last name: ");
      // Read the user's last name
	  lastName = keyboard.nextLine();
      // Concatenate the user's first and last names
	  fullName = firstName + " " + lastName;
      // Print out the user's full name
	  System.out.println(fullName + " has " + fullName.length() + " characters.");

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
	  firstInitial = firstName.charAt(0);
      // Print out the user's first initial
	  System.out.println("first initial: " + firstInitial);
      // Convert the user's full name to uppercase
	  fullName = fullName.toUpperCase();
      // Print out the user's full name in uppercase
	  System.out.println("Full name in all capital: " + fullName);

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
	  System.out.print("Enter the diameter of a sphere: ");
      // Read the diameter
	  d = keyboard.nextFloat();
      // Calculate the radius
	  r = d / 2.0;
      // Calculate the volume
	  v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
      // Print out the volume
	  System.out.println("Volume is: " + v);
   }
}