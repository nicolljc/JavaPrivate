/**
	This program demonstrates the Car class.
*/

public class CarTester
{
	public static void main(String[] args)
	{
		// Create a Car object
		Car myCar = new Car(2002, "BMW");
		
		// Display My Car
		System.out.println("My Car:");
		System.out.println("Year: " + myCar.getYear());
		System.out.println("Make: " + myCar.getMake());
		System.out.println("Speed: " + myCar.getSpeed());
		
		// Accelerate 5 times
		System.out.println("Now I will accelerate 5 times.");
		
		int i;
		
		for(i = 1; i < 5; i++)
		{
			myCar.accelerate();
			System.out.println("After acceleration " +
				i + " current speed = " + myCar.getSpeed());
		}
		
		// Brake 5 times
		System.out.println("Now I will brake 5 times.");
		
		for(i = 1; i < 5; i++)
		{
			myCar.brake();
			System.out.println("After brake " + i +
				" current speed = " + myCar.getSpeed());
		}
	}
}