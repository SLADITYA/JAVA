// Parsing Examples (String to Integer Conversion)

public class Example
{
    public static void main(String[] args) 
    {
        String x = "10";
        int a = Integer.parseInt(x);
        String y = "1100";
        int b = Integer.parseInt(y, 2);
        String z = "ABC";
        int c = Integer.parseInt(z, 16);
        System.out.println(a * a);
        System.out.println(b);
        System.out.println(c);
    }
}