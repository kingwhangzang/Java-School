class Student extends Members 
{
	String dept;
	Members students[];

	public Student (String name, int idnum, String dept) {
		super(name, idnum, dept);
	}

	public void work() {
		System.out.println("Student : \"" + name + "(ID : "+id+") "+
		"\"  studies hard with his Teachers in " +dept +" dept.");
	}
}
