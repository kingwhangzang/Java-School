class Teacher extends Members
{
	String dept;
	Members students[];

	public Teacher (String name,int idnum, String dept) {
		super(name, idnum, dept);
	}

	public void work() {
		System.out.println("Teacher : \"" + name + "(ID : "+id+") "+
		"\"  studies hard with his Teachers in " +dept +" dept.");
	}
}
