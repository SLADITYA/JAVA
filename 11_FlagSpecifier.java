// %[flags][width][.precision]conversion_character

// Flag Specifier

// %010d - To pad the number with zeros up to a width of 10 characters.
// %+d - Includes the Sign of the number
// % (d - Includes a leading space if the number is positive

public class FlagSpecifier
{
    public static void main(String[] args) 
    {
        int number = 123;

        System.out.printf("%+d", number);   // Output - 123
        System.out.println();
        System.out.printf("% (d", number);  // Output -  123
        System.out.println();
        System.out.printf("%010d", number); // Output - 0000000123
    }
}