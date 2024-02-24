// %[flags][width][.precision]conversion_character

// Precision Specifier

public class PrecisionSpecifier
{
    public static void main(String[] args) 
    {
        double number = 123.456789;

        System.out.printf("%.4f", number);  // number -> 123.4567
        System.out.println();
        System.out.printf("%.2f", number);  // number -> 123.45
    }
}