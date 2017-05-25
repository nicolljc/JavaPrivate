/**
	The Car class demonstrates a car.
*/

public class Car
{
	private int yearModel;		// Year of the car
	private String make;		// Make of the car
	private int speed;			// Speed of the car
	
	/**
		This constructor sets the starting speed 
		at 0.
	*/
	
	public Car(int y, String m)
	{
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	/**
		The setYear  method sets the car's year.
		@param y The value to store in the year field.
	*/
	
	public void setYear(int y)
	{
		yearModel = y;
	}
	
	/**
		The setMake method sets the car's make.
		@param m The value to store in the make field.
	*/
	
	public void setMake(String m)
	{
		make = m;
	}
	
	/**
		The setSpeed method sets the car's speed.
		@param s The value, as an int, to store in
		the speed field.
	*/
	
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	/**
		The getYear method returns the
		car's year.
		@return The value in the year field.
	*/
	
	public int getYear()
	{
		return yearModel;
	}
	
	/**
		The getMake method returns the
		car's make.
		@return The value in the make field.
	*/
	
	public String getMake()
	{
		return make;
	}
	
	/**
		The getSpeed method returns the
		car's speed.
		@return The value in the speed field.
	*/
	
	public int getSpeed()
	{
		return speed;
	}
	
	/**
		The accelerate method increases
		the car's speed.
		@param 5 The amount to increase
		the speed field.
	*/
	
	public void accelerate()
	{
		speed += 5;
	}
	
	/**
		The brake method decreases
		the car's speed.
		@param 5 The amount to decrease
		the speed field.
	*/
	
	public void brake()
	{
		speed -= 5;
	}
}