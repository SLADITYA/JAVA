/*
Standard Input for 2-D arrays

Input:
Rows Cols
Rows * Cols elements

Input:                  
2 3
10 20 30 40 50 60

Input:
3  4 -> 3 x 4 = 12            
10 20 30 40             
50 60 70 80
90 10 20 30
*/

import java.util.Arrays;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int R, C;
        R = sc.nextInt();   // reading rows
        C = sc.nextInt();   // reading columns

        // Create a 2-D Array of R rows and C Columns
        int[][] arr = new int[R][C];
        
        // arr[i][j] = arr[0][0], arr[1][1]
        for (int i = 0; i < R; i++) 
        {
            for (int j = 0; j < C; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Running a for-each loop on 2-D Array
        for (int[] eachArray : arr) 
        {
            for (int eachValue : eachArray) 
            {
                System.out.print(eachValue * eachValue + " ");    
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));   // For having a quick look at the array
        sc.close();
    }
}