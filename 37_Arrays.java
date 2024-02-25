// Arrays of Varying Length

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) 
    {
        int[][] arr = new int[3][];    // Arrays of varying length
        
        arr[0] = new int[8];    // arr[0] of length 8
        arr[1] = new int[5];    // arr[1] of length 5
        arr[2] = new int[2];    // arr[2] of length 2

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }   
}