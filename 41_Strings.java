// Strings In Java

public class Example
{
    public static void main(String[] args) 
    {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};    // Character Array -> Mutable

        System.out.println(arr);

        arr[1] = 'z';

        System.out.println(arr);

        String s = "Hello";    // Stored in String Constant Pool (SCP) -> Present inside Heap
        String t = "Hello";
        String p = "Hello";    // Strings -> Immutable

        System.out.println(s == t && t == p);

        String x = new String("Hello");    // Stored in Heap
        String y = new String("Hello");

        System.out.println(x == y);
    }
}

// Note - Stack stores refrences (variables) and Heap stores instances (values)