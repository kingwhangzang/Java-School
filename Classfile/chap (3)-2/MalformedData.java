class MalformedData extends RuntimeException 
{
	public MalformedData() 
	{
		super ("wrong data format");
		System.out.println("MalformedData : wrong format");
	}
}
