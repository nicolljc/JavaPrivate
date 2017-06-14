public class TestPeople
{
	public static void main(String[] args)
	{
		// Person array with 4 elements
		Person[] people = new Person[4];
		
		// Initialize constructors
		people[0] = new Person("John", true);
		people[1] = new Person("Jane", false);
		people[2] = new Student("Joe", true, 3.8);
		people[3] = new Student("Mary", false, 4.0);
		
		// Display people using toString methods
		for (int i = 0; i < people.length; i++)
			System.out.println(people[i].toString());
	}
}