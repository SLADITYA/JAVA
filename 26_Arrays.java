// One Dimensional Array

import java.util.Scanner;

public class Example
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();  // size
        // Creating an array of n elements
        
        int[] arr = new int[n];
        // int arr[] = new int[n] -> C Style

        for(int i = 0; i < n; i++)  // Reading
        {
            arr[i] = read.nextInt();
        }
        for(int i = 0; i < n; i++)  // Accessing
        {
            System.out.printf("%d ", arr[i]);
        }

        for (int var: arr)  // Accessing (for each loop)
        {
            System.out.print(var + " ");
        }
        read.close();
    }    
}