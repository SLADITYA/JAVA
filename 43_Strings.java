// Character Array to String and Vice Versa

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) 
    {
        String str = "hello";
        
        char[] arr = str.toCharArray();    // {'h', 'e', 'l', 'l', 'o'}

        Arrays.sort(arr);   // Sort using Arrays.sort();

        String sortedString = new String(arr);  // Convert the character array back to a String   // new String(charArray)

        System.out.println(sortedString);
    }
}