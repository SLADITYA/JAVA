interface Operations
{
    // every method you create is by-default public and abstract 
    
    int factorial(int n);  // public abstract int factorial(int n)
}

class Math1 implements Operations
{
    public int factorial(int n)    // Using Iterative
    {
        int f = 1;
        for (int i = 1; i <= n; i++) 
        {
            f *= i;
        }
        return f;
    }
}

class Math2 implements Operations
{
    public int factorial(int n)    // Using Reccursive
    {
        if (n == 1) 
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}

public class Example 
{
    public static void main(String[] args) 
    {
        Math1 obj1 = new Math1();
        Math2 obj2 = new Math2();

        int x = obj1.factorial(5);
        int y = obj2.factorial(5);

        System.out.println(x + " " + y);
    }
}