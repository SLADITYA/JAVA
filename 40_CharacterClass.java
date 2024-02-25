// Character Class

// Upper case alphabet -> ch >= 'A' && ch <= 'Z'    // Built-in Methods

// These builtin methods are present in class called character - java.lang

public class Example
{
    public static void main(String[] args) 
    {
        String str1 = "" + 'c';
        String str2 = Character.toString('z');  // "z"
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isAlphabetic('x'));
        System.out.println(Character.isAlphabetic('X'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('$'));
        System.out.println(Character.isDigit('9'));
        System.out.println(str1);
        System.out.println(str2);
    }   
}