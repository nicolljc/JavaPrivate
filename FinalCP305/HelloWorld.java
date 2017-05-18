import java.util.Scanner;			// Needed for Scanner class
import java.util.Random;			// Needed for Random class

public class HelloWorld
{
	public static void main(String[] args)
	{
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, World!"); // Hello World greeting
		System.out.println(); // Print blank line
		
		// Variables
		String firstName;				// User's first name
		String lastName;				// User's last name
		int testScore;					// Numeric test score
		String input;					// To hold input user input
		
		// Prompt the user for their first name
		System.out.print("What is your first name? ");
		// Read the user's first name
		firstName = keyboard.nextLine();
		
		// Prompt the user for their last name
		System.out.print("What is your last name? ");
		// Read the user's last name
		lastName = keyboard.nextLine();
		
		System.out.println(); // Print blank line
		
		// Print out the user's full name
		System.out.println("Welcome to CP305 " + firstName + " " + lastName + "!");
		System.out.println(); // Print blank line
		
		// Get the numeric test score.
		System.out.print("Enter your projected final test score and I will give" + 
							"you a letter grade: ");
		testScore = keyboard.nextInt();
		
		// Display the grade.
		if (testScore < 60)
			System.out.println("You will score a F.");
		else if (testScore < 70)
			System.out.println("You will score a D.");
		else if (testScore < 80)
			System.out.println("You will score a C.");
		else if (testScore < 90)
			System.out.println("You will score a B.");
		else
			System.out.println("You will score an A.");
		
		System.out.println(); // Print blank line
		
		Random rand = new Random();

		int die1 = 0;		// First die integer
		int die2 = 0;		// Seconde die integer
		int sum = 0;		// Sum of both die
		int roll = 0;		// Number of rolls
		
		// Table header
		System.out.println(" Roll	Die1	Die2	Sum");
		System.out.println("---------------------------");
		
		do
		{
			die1 = rand.nextInt(6) + 1;	// Roll 1-6 for first die
			
			die2 = rand.nextInt(6) + 1; // Roll 1-6 for second die
			
			sum = die1 + die2;	// Calculate the sum of the die
			roll++;
			System.out.printf("%4d%6d%8d%8d\n", roll, die1, die2, sum);
		}
		while (sum != 12);  // While loop for sum of 12
		System.out.println("---------------------------");
		System.out.println("Box Cars in " + roll + " rolls!");		
	}
}