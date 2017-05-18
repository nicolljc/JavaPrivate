import java.util.Random;

public class RandomLoop
{
	public static void main(String[] args)
	{
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
			
			sum = die1 + die2;
			roll++;
			System.out.printf("%4d%6d%8d%8d\n", roll, die1, die2, sum);
		}
		while (sum != 12);
		System.out.println("---------------------------");
		System.out.println("Box Cars in " + roll + " rolls!");
	}
}