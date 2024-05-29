public class BalanceOutOfBoundsException extends Exception
{
	public BalanceOutOfBoundsException() {
		super ("out of amount");
		System.out.println("Balance Out : wrong request ");
	}
}
