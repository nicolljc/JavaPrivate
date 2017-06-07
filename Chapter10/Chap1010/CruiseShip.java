public class CruiseShip extends Ship
{
	int maxPassengers;		// Maximum passengers Ship can hold
	
	// Constructor for Ship, Year, and Maximum Passengers
	public CruiseShip(String ship, int year, int maxPassengers)
	{
		super(ship, year);
		this.maxPassengers = maxPassengers;
	}
	
	// Get the Maximum Passengers for Cruise Ship
	public int getMaxPassengers()
	{
		return maxPassengers;
	}
	
	// toString method to display Ship Name and Maximum Passengers
	public String toString()
	{
		return "\nShip Name: " + getShipName() +
				"\nMaximum Number of passengers: " +
				getMaxPassengers();
	}
}