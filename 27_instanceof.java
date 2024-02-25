// instanceof Operator - Test whether the object is an instance of the specified type (class or subclass or interface)

// instanceof Operator returns a boolean value (true or false)

import java.util.Scanner;

public class Example 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(sc instanceof Scanner);
        System.out.println(sc instanceof Object);
        System.out.println(arr instanceof Object);
        sc.close();
    }
}