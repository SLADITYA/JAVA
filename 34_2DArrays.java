/*
2 D Array - 2 or more 1 D Arrays put together.
3 D Array - 2 or more 2 D Arrays put together.
4 D Array - 2 or more 3 D Arrays put together.
*/

public class Example
{
    public static void main(String[] args) 
    {
        //                     0             1
        int[][] marks = {{10, 20, 30}, {40, 50, 60}};   // Dimensions - 2 x 3
        //                 0   1   2     0   1   2
        System.out.println(marks[0][1]);
        System.out.println(marks[1][1]);

        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.printf("%d ", marks[i][j]);
            }
            System.out.println();
        }
    }
}