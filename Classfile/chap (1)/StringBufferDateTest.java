import java.util.Date;

class StringBufferDateTest 
{
	public static void main(String[] args) 
	{
		StringBuffer buf = new StringBuffer();

		buf.append("Hello");
		buf.append("Soyun");

		System.out.println(buf.toString());

		Date date = new Date();
		buf.append(date);
		System.out.println(buf.toString());
	}
}
