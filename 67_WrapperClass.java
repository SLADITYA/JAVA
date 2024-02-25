// Wrapper Class

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) 
    {
        // b -> Object  a -> Primitive  c -> Primitive

        int a = 10;
        Integer b = a;  // Auto Boxing
        int c = b;  // Auto Unboxing

        System.out.println(b + " " + c);

        // char arr1[] = new char[10];  // A character array

        Character arr2[] = {'z', '?', 'x', 'y'};    // Wrapper class Character Array

        Integer arr3[] = {10, 20, 30, 40};  // Wrapper class Integer Array

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }   
}

// Note - Here the object b is wrapped in a box