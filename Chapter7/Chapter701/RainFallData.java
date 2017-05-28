/**
	This class keeps the rainfall figures for a number of
	months in an array and provides methods for getting
	the total and average rainfall, and the highest and 
	lowest amounts of rainfall.
*/

public class RainFallData
{
	private double[] RainFall;	// The rainfall data
	
	/**
		The constructor copies the elements in
		an array to the rainfall array.
		@param r The array to copy.
	*/
	
	public RainFallData(double[] r)
	{
		// Create an array as large as r.
		RainFall = new double[r.length];
		
		// Copy the elements from r to RainFall.
		for (int index = 0; index < r.length; index++)
			RainFall[index] = r[index];
	}
	
	/**
		getTotal method
		@return The total of the elements in
		the RainFall array.
	*/
	
	public double getTotal()
	{
		double total = 0.0;		// Accumulator
		
		// Accumulate the sum of the elements
		// in the RainFall array.
		for (int index = 0; index < RainFall.length; index++)
			total += RainFall[index];
		
		// Return the total.
		return total;
	}
	
	/**
		getAverage method
		@return The average of the elements
		in the RainFall array.
	*/
	
	public double getAverage()
	{
		return getTotal() / RainFall.length;
	}
	
	/**
		getHighest method
		@return The highest value stored
		in the RainFall array.
	*/
	
	public double getHighest()
	{
		double highest = RainFall[0];
		
		for (int index = 1; index < RainFall.length; index++)
		{
			if (RainFall[index] > highest)
				highest = RainFall[index];
		}
		return highest;
	}
	
	/**
		getLowest method
		@return The lowest value stored
		in the RainFall array.
	*/
	
	public double getLowest()
	{
		double lowest = RainFall[0];
		
		for (int index = 1; index < RainFall.length; index++)
		{
			if (RainFall[index] < lowest)
				lowest = RainFall[index];
		}
		return lowest;
	}
}