// Import Scanner for Scanner class
import java.util.Scanner;

public class City
{
   public static void main (String[] args)
   {      
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Declare variables
		String cityName;
		char firstCharacter;
	  
		// Prompt the user for the City name
		System.out.print("Enter the name of your favorite City: ");
		// Read the user's favorite City name
		cityName = keyboard.nextLine();
			  
		System.out.println();	// To leave a blank line
		
		// Print out the user's favorite City name
		System.out.println(cityName + " has " + cityName.length() + " characters.");

		// Get the first character from the user's favorite City name
		firstCharacter = cityName.charAt(0);
		// Print out the City's first character
		System.out.println("First character: " + firstCharacter);
		// Convert the City name to uppercase
		cityName = cityName.toUpperCase();
		// Print out the City name in uppercase
		System.out.println("City name in all capital: " + cityName);
		// Convert the City name to lowercase
		cityName = cityName.toLowerCase();
		System.out.println("City name in all lower: " + cityName);

		System.out.println();	// To leave a blank line
   }
}