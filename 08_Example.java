// By default java treats point values as double and every real no as integer

public class Example
{
	public static void main(String[] args)
	{
		float x = 1.2f;	 // float value
		System.out.println(x);
		long y = 23446573788458l;   // long value
		System.out.println(y);
		System.out.printf("%.3f",x);	// adjusting float values
	}
}