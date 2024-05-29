class ForHelloFriends
{
	public static void main(String[] args) 
	{
		int i;
		System.out.println("Hello");
		for (String name : args)
		{
			System.out.print(name);
			System.out.print(" ");
		}
		System.out.println();
	}
}
