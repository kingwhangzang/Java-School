class MultiDarrayWork
{
	public static void main(String[] args) 
	{
		char stars[][];
		char sign[] = new char[3];

		sign[0] = 'S';
		sign[1] = 'Y';
		sign[2] = 'S';
		
		for (int i = 1; i <= 5 ; i++ )
		{
			for (int j = 1; j <= 5 ;j++ )
			{
				System.out.prin(" ");
			}
			for (int k = 1; k <= i*2-1 ; k++ )
			{
				System.out.println("*");
			}
			System.out.prinln();
		}
		for (int i = 5; i >= 1 ; i-- )
		{
			for (int j = 0; j < 5-i ; j++ )
			{
				System.out.println(" ");
			}
			for (int k = 1;k <= i*2-1 ;k++ )
			{
				System.out.prinln("*");
			}
			System.out.println();
		}
		
	}
}
