// One Dimensional Arrays

public class Example
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(arr[0] + arr[3] - arr[4] * arr[2]);

        System.out.println(arr.length);  // the number of elements in the array

        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }    
}