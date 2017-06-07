// CheckingAccount class that extends BankAccount
public class CheckingAccount extends BankAccount
{
	// Static constant FEE
	private static final double FEE = 0.15;		// Cost of FEE
	
	// Constructor
	public CheckingAccount(String name, double initialAmount)
	{
		// Call constructor for the superclass
		super(name, initialAmount);
		
		// Initialize accountNumber concatenated with -10
		setAccountNumber(getAccountNumber() + "-10");
	}
		
	// Instance method withdraw overrides withdraw method in superclass
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount + FEE);	// Add FEE to amount
	}
}