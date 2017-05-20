import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class Dice
{
	private int spots;	// number of spots up on the die
	private static Random generator;	// random number generator
	
	public Dice()
	{
		generator = new Random();
		spots = 0;
	}
	
	// simulate rolling the die
	public void roll()
	{
		spots = generator.nextInt(6) + 1;
	}
	
	// return value of die
	public int getSpots()
	{
		return spots;
	}
}

public class DiceSimulation
{
	public static void main(String[] args)
	{
		final int NUMBER = 10000;  // Number of dice rolls
		
		Dice die1 = new Dice(); // first die
		Dice die2 = new Dice(); // second die

		// A random number generator used in
		// simulating the rolling of dice
		Random generator = new Random();

		int die1Value;       // Value of the first die
		int die2Value;       // Value of the second die
		int count = 0;       // Total number of dice rolls
		int snakeEyes = 0;   // Number of snake eyes rolls
		int twos = 0;        // Number of double two rolls
		int threes = 0;      // Number of double three rolls
		int fours = 0;       // Number of double four rolls
		int fives = 0;       // Number of double five rolls
		int sixes = 0;       // Number of double six rolls

		// TASK #1 Enter your code for the algorithm here
		while (count < NUMBER)
		{
			die1.roll();
			int t1 = die1.getSpots();
			die2.roll();
			int t2 = die2.getSpots();
		  
			if (t1 == t2)
			{
				if (t1 == 1)
				{
					snakeEyes++;
				}
				else if (t1 == 2)
				{
					twos++;
				}
				else if (t1 == 3)
				{
					threes++;
				}
				else if (t1 == 4)
				{
					fours++;
				}
				else if (t1 == 5)
				{
					fives++;
				}
				else if (t1 == 6)
				{
					sixes++;
				}
			}
			count++;

			// Display the results
			System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");
			System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");
			System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
			System.out.println ("You rolled double fours " +
                          fours + " out of " + count +
                          " rolls.");
			System.out.println ("You rolled double fives " +
                          fives + " out of " + count +
                          " rolls.");
			System.out.println ("You rolled double sixes " +
                          sixes + " out of " + count +
                          " rolls.");
		}
	}
}