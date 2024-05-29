class School 
{
	Teacher YYY;
	Members kim, son, choi, Yoon;
	Members students[];

	public School () {
		YYY = new Teacher("Yoon",10313,"IT");
		kim = new Student("kim", 211323, "IT");
		son = new Student("son", 201323, "IT");
		choi = new Student("choi", 2113244,"IT");

		students = new Members[4];
		students[0] = YYY;
		students[1]=kim;
		students[2] = son;
		students[3] = choi;
	}

	public void makeWork() {
		int n = students.length;
		for(int i = 0; i < n; i++) {
			students[i].work();
		}
	}
	public static void main(String[] args) 
	{
		School mycom = new School();
		mycom.makeWork();
	}
}
