// Terenary Operator (?:) 

// condition ? expression1 : expression2

// if condition is true, exp1 will be evaluated

// else exp2 will be evaluated

public class Example
{
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		int max = a > b ? a : b;
		System.out.println(max);
		System.out.println(a > b ? a : b);
		int n = 10;
		System.out.println(n % 2 == 0 ? "Even" : "Odd");
	}
}