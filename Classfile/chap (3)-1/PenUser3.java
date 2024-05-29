class PenUser3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Pen3!");

		Pen3 mypen1 = new Pen3();
		mypen1.write();
		mypen1.write(1000);
		mypen1.write(1000,"Red");

		Pen3 mypen2 = new Pen3("IT");
		mypen2.write();
		mypen2.write(2000);
		mypen2.write(3000,"SMU2");

		Pen3 mypen3 = new Pen3("IT");
		mypen3.write();
		mypen3.write(3000);
		mypen3.write(3000,"SMU3");
		mypen3.write(3000,"SMU3","Yellow");
	}
}