// %[flags][width][.precision]conversion_character

// Width Specifier

public class WidthSpecifier 
{
    public static void main(String[] args) 
    {
        int no = 123;

        System.out.printf(" %5d", no);  // Minimum width of 5 characters
        System.out.println();
        System.out.printf("%-5d", no);  // Minimum width of 5 characters, left-aligned

    }
}