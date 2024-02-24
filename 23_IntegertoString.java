// Parsing Examples (Integer to String)

public class Example
{
    public static void main(String[] args) 
    {
        int a = 12;
        int b = 2748;
        String x = Integer.toString(a, 2);  // "1100" -> Binary String
        String y = Integer.toString(b, 16); // "abc" -> Hex String
        System.out.println(x);
        System.out.println(y);
    }
}