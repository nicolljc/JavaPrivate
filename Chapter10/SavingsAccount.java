public class SavingsAccount extends BankAccount
{
	private double rate = 0.025;			// Annual interest rate
	private static int savingsNumber = 0;	// Initialized to 0
	private String accountNumber;			// Account Number
	
	// Constructor taking name and initialBalance as parameters
	public SavingsAccount(String name, double initialBalance)
	{
		// Call constructor for superclass
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" +
						savingsNumber;
	}
	
	// Copy constructor taking oldAccount and initialBalance
	// as parameters
	public SavingsAccount(SavingsAccount oldAccount, double initialBalance)
	{
		// Call constructor for superclass
		super(oldAccount, initialBalance);
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" +
						savingsNumber;
	}
	
	// Interest method
	public void postInterest()
	{
		// Calculate one month's interest
		double newBalance = getBalance() * (1 + rate/12);
		setBalance(newBalance);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
}