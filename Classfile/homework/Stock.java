class Stock 
{
	private String name;
	private long balance;

	public Stock(String name) {
		this.name = name;
	}

	public void plusStock(int amount) throws Malformed{
		if (amount <= 0)
		{
			throw new Malformed();
		}
		balance = balance + amount;
	}
	public void Order(int amount) throws BalaceOut, Malformed
	{
		if (amount <= 0)
		{
			throw new Malformed();
		}
		if (balance < amount)
		{
			throw new BalanceOut();
		}
		balance  = balance - amount;
	}

	public void check() {
		System.out.println(name + " : " + balance);
	}
}
