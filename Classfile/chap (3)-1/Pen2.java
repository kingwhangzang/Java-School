class Pen2
{
	String vender;
	String color;
	int price;

	public Pen2() { 
	}

	public Pen2(String c) {
		color = c; 
	}
	public Pen2(int p) {
		price = p;
	}
	public Pen2(String c, String v, int p){
		color = c;
		vender = v;
		price = p;
	}

	public void write() 
	{
		System.out.println("Pen : write()");
		System.out.println("Pen Vender: " + vender);
		System.out.println("Pen Color : "+color);
		System.out.println("Pen Price : "+price);
	}
	public void erase() {
		System.out.println("Pen : erase()");
	}
}
