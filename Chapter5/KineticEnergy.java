import java.util.Scanner;		// Needed for the Scanner class

public class KineticEnergy
{
	public static double kineticEnergy( double mass, double velocity)
	{
		double kineticEnergy = ((double)1 / 2) * mass * (Math.pow(velocity, 2));
		return kineticEnergy;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double Mass, Velocity, kineticEnergy;
		
		System.out.println("Please enter the mass: ");
		Mass = scanner.nextDouble();
		
		System.out.println("Please enter the velocity: ");
		Velocity = scanner.nextDouble();
		
		kineticEnergy = kineticEnergy(Mass, Velocity);
		System.out.printf("The Kinetic energy with mass %.2f kilograms and velocity %.2f meters a second is %.2f",
			Mass, Velocity, kineticEnergy);
	}
}