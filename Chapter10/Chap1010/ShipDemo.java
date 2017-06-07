public class ShipDemo
{
	public static void main(String[] args)
	{
		// Create array of type ship of size
		Ship[] ships = new Ship[3];
		
		// Initialize constructors
		ships[0] = new Ship("Jenny", 1982);
		ships[1] = new CruiseShip("Titanic", 1911, 3547);
		ships[2] = new CargoShip("Colombo", 2005, 93750);
		
		// Display ships using toString methods
		for (int i = 0; i < ships.length; i++)
			System.out.println(ships[i].toString());
	}
}