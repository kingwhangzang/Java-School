class TryTest
{
	public static void main(String[] args) 
	{
		String msg[] = {"Yoon", "So", "Yun"};
		int n = msg.length;

		for (int i = 0; i <= n ; i++ )
		{
			try{
				System.out.println(msg[i]);
			} catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Oops, sorry. There is an exception.");
			}
		}
		System.out.println("Everything is done.");
	}
} 