class Bank 
{
	public static void main(String[] args) 
	{
		Account hong = new Account("hong");
		hong.deposit(20);
			//hong.deposit(-100) MalformedData exception
		try
		{
			hong.withdraw(15);
		}
		catch (BalanceOutOfBoundsException be)
		{
			be.printStackTrace();
		}
		catch (MalformedData me) {
			me.printStackTrace();
		}
		
		try
		{
			hong.withdraw(10);
		}
		catch (BalanceOutOfBoundsException be)
		{
			be.printStackTrace();
		}
		System.out.println("normal");
	}
}
