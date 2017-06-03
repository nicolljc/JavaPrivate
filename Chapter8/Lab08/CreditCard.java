/*
	The CreditCard class simulates a credit card.
*/

public class CreditCard
{
	private Person owner;		// Owner of the credit card
	private Money balance;		// Balance on the credit card
	private Money creditLimit;	// Credit limit on the credit card
	
	/**
		Constructor
		@param owner The owner of the card
		@param creditLimit The credit limit on the account
	*/
	
	public CreditCard(Person owner, Money creditLimit)
	{
		this.owner = owner;
		this.balance = new Money(0);
		this.creditLimit = new Money(creditLimit);
	}
	
	public String getCreditLimit()
	{
		Money limit = new Money(this.creditLimit);
		return limit.toString();
	}
	
	public String getPersonals()
	{
		return this.owner.toString();
	}
	
	public void charge(Money money)
	{
		int state = (money.add(this.balance)).compareTo(this.creditLimit);
		if (state == -1)
		{
			this.balance = this.balance.add(money);
			System.out.println("Charge: " + money);
		}
		else
			System.out.println("Exceeds credit limit");
	}
	
	public void payment(Money money)
	{
		this.balance = this.balance.subtract(money);
		System.out.println("Payment: " + money);
	}
	
	public String getBalance()
	{
		Money ret = new Money(this.balance);
		return ret.toString();
	}
}