package encapsulation;

public class Account {
	private int account_id;
	private float balance;
	private String password;
	
	public int getaccountid()
	{
		return account_id;
		
	}
	public void setaccountid(int id)
	{
		account_id=id;
	}
	//Verification
	public void getbalance(String pass)
	{
		if(password==pass)
		{
			System.out.println("Balance is: "+balance);
		}
		else
			System.out.println("Incorrect password");
	}
	//Validation
	public void setbalance(float balance)
	{
		if(balance>0)
		{
			this.balance=balance;
		}
		else
			System.out.println("Assign balance greater than 0");
		
	}
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	
}
