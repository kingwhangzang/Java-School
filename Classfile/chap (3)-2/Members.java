class Members 
{
	String name;
	String dept;
	String major;
	int id;

	public Members(String n, int i, String d) 
	{
		name = n;
		dept = d;
		id = i;
	}

	public void work() {
		System.out.println("\tStudent : \""+name + "\"does his best.");
	}
}
