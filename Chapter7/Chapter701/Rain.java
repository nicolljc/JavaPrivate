import javax.swing.JOptionPane;

/**
	This program gathers rainfall amounts for the year.
	It uses the RainFallData class to display the total,
	average, highest, and lowest rainfall amounts.
*/

public class Rain
{
	public static void main(String[] args)
	{
		final int ONE_YEAR = 12;	// Number of elements
		
		// Create an array to hold rainfall amounts for a year.
		double[] RainFall = new double[ONE_YEAR];
		
		// Get the year's rainfall data.
		getValues(RainFall);
		
		// Create a RainFallData object, initialized
		// with the year's rainfall figures.
		RainFallData year = new RainFallData(RainFall);
		
		// Display the total, average, highest, and lowest
		// rainfall amounts for the year.
		JOptionPane.showMessageDialog(null,
			String.format("The total rainfall was: " + year.getTotal() + "\n"
					+ "The average rainfall was: " + year.getAverage() + "\n"
					+ "The highest rainfall was: " + year.getHighest() + "\n"
					+ "The lowest rainfall was: " + year.getLowest()));
					
		System.exit(0);
	}
	
	/**
		The getValues method asks the user to enter rainfall
		amounts for each element of an array.
		@param array The array to store the values in.
	*/
	
	private static void getValues(double[] array)
	{
		String input;	// To hold user input.
		
		// Get rainfall data for each month of the year.
		for (int i = 0; i < array.length; i++)
		{
			input = JOptionPane.showInputDialog
					("Enter the rainfall for month " +
					(i + 1) + ".");
			array[i] = Double.parseDouble(input);
		}
	}
}