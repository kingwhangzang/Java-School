class Pen2User 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Pen!");

		Pen2 mypen = new Pen2();
		mypen.write();

		Pen2 mypen2 = new Pen2("IT");
		mypen2.write();

		Pen2 mypen3 = new Pen2(10000);
		mypen3.write();

		Pen2 mypen4 = new Pen2("SMU","Green",2000);
		mypen4.write();


		mypen.erase();
	}
}
