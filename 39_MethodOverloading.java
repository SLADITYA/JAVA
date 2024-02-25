// Method Overloading in Java

public class Example
{
    static void max(int a, int b)
    {
        System.out.println(a > b ? a : b);
    }

    static void max(int a, int b, int c)
    {
        if (a >= b && a >= c) 
        {
            System.out.println(a);    
        }
        else if (b >= c && b >= a) 
        {
            System.out.println(b);    
        }
        else
        {
            System.out.println(c);
        }
    }

    static void max(int[] arr, int n)
    {
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (mx < arr[i]) 
            {
                mx = arr[i];
            }
        }
        System.out.println(mx); 
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        
        max(10, 10, 9);
        max(10, 20);
        max(arr, 4);
    }
}