public class Person 
{
   // a person is a name and sex (male/female
   private String name;
   private boolean sex; // true is male

   // create a new specific person
   // the name and sex can only be set at instantiation
   public Person(String name, boolean sex)
   {
      this.name = new String(name);
      this.sex = sex;
   }

   // accessor for name
   public String getName()
   {
      return new String(name);
   }

   // accessor for male or female
   public String getSex()
   {
      return sex ? "male" : "female";
   }
   
   // toString method to display Person Name and Sex
	public String toString()
	{
		return "\n" + getName() + " " + getSex();
	}
}