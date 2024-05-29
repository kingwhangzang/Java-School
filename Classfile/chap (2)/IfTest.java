class IfTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		if(args.length > 0) {
			System.out.println(args[1]);
		} else {
			System.out.println("????");
		}
	}
}
