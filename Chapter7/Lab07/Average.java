import java.util.Scanner;	// Needed for the Scanner class

public class Average
{
	private double mean;	// Holds the mean
	private int[] data;		// Array of test scores
	private int total = 0;	// Accumulator
	
	public Average()
	{
		// Create an array referenced by data with 5 elements.
		data = new int[5];
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Read the test scores into the array
		for (int i = 0; i < data.length; i++)
		{
			System.out.print("Enter your score for test#" +
							(i + 1) + ": ");
			data[i] = keyboard.nextInt();
		}
			
			// Call the selectionSort method
			this.selectionSort();
			
			// Call the calculateMean method
			this.calculateMean();
	}
	
	/**
		The calculateMean method accepts a reference to an array as
		The average test score from the data array
	*/
	
	public double calculateMean()
	{
		int i, s = 0;
		for (i = 0; i < data.length; i++)
		{
			s = s + data[i];
		}
		mean = (double) s / (data.length);
		return mean;
	}
	
	/**
		The selectionSort method performs a selection sort on an
		int array. The array is sorted in ascending order.
		@param array The array to sort.
	*/
	
	public void selectionSort()
	{
		int maxIndex;
		int maxValue;
		
		for (int startScan = 0; startScan < data.length; startScan++)
		{
			maxIndex = startScan;
			maxValue = data[startScan];
			for(int index = startScan + 1; index < data.length; index++)
			{
				if(data[index] > maxValue)
				{
					maxValue = data[index];
					maxIndex = index;
				}
			}
			data[maxIndex] = data[startScan];
			data[startScan] = maxValue;
		}
	}
	
	public String toString()
	{
		String output;
		output = "The test scores in descending order are \n";
		
		for (int i = 0; i < data.length; i++)
		{
			output = output + data[i] + " ";
		}
		output = output + "\nThe average is " + mean;
		return output;
	}
}
	