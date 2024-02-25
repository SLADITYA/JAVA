// Default  Values in Java

import java.util.Arrays;
import java.util.Scanner;

class ABCD{}

public class Example
{
    int y;  // Instance Variable
    static boolean z;   // Static Variable
    static Scanner sc;
    static ABC obj2;
    public static void main(String[] args) 
    {
        // int x;  // Local Variable
        // System.out.println(x);
        
        Example obj1 = new Example();
        System.out.println(obj1.y);

        System.out.println(z);
        System.out.println(sc);
        System.out.println(obj2);

        String[] data = new String[5];
        System.out.println(Arrays.toString(data));
    }
}