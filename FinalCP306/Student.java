public class Student extends Person
{
	private double studentGPA;
	
	public Student(String name, boolean sex, double studentGPA)
	{
		// Call constructor for superclass
		super(name, sex);
		this.studentGPA = studentGPA;
	}
	
	public void setGPA(double newGPA)
	{
        studentGPA = newGPA;
    }
	
	public double getGPA()
	{
		return studentGPA;
	}
	
	// toString method to display Name, Sex, and GPA
	public String toString()
	{
		return "\n" + getName() + " " + getSex() +
				" " + getGPA();
	}
}