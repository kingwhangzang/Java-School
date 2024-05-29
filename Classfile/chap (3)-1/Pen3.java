class Pen3
{
	String vender;
	String color;
	int price;

	public Pen3(){}
	public Pen3(String name){
		vender = name;
	}
	public Pen3 (String name, String col, int pp) {
		vender = name;
		color = col;
		price = pp;
	}

	void write() {
		System.out.println("Pen: write()");
		System.out.print("Pen Vender: " + vender);
		System.out.print(", Pen color: " + color);
		System.out.println(", Pen price: " + price);
	}
	void write(int xx){
		System.out.println("Pen: write(int xx)");
		System.out.print("Pen Vender: " + vender);
		System.out.print(", Pen color: " + color);
		System.out.println(", Pen price: " + xx);	
	}
	void write(int xx, String yy){
		System.out.println("Pen: write(int, String)");
		System.out.print("Pen Vender: " + yy);
		System.out.print(", Pen color: " + color);
		System.out.println(", Pen price: " + xx);	
	}
	void write(int xx, String yy, String zz){
		System.out.println("Pen: write(int, String, String)");
		System.out.print("Pen Vender: " + yy);
		System.out.print(", Pen color: " + zz);
		System.out.println(", Pen price: " + xx);	
	}
}
