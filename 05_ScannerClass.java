// Taking an input from the user

import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args) 
    {

        // Creating an object - classname objectname = new classname();
        // Object of Scanner Class

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        System.out.printf(" \nSum of %d and %d is %d", a, b, a + b);
        sc.close();    // Optional
    }
}

// Note - You can take input without creating an object in this way.

// int a = new Scanner(System.in).nextInt();