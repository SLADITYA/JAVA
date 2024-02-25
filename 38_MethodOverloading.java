// Method Overloading

/* 
Same method with same name but with different signature

1. Changing the number of parameters
2. Changing the datatype of parameters
*/

public class Example 
{
    static void add(int a, int b)
    {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    static void add(double a, double b)
    {
        System.out.println(a + b);
    }

    static void add(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) 
    {
        add(10, 20, 30);
        add(10, 20);
        add(12.56, 12.34);
        
        int[] arr = {10, 20, 30, 40};
        add(arr, 4);
    }
}