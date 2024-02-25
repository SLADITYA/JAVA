// Usage of Array Class

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        String[] arr1 = {"abc", "xyz"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        int A[] = {7, 8, 11, -1, -36, 24, 6};   // Performs sort in-place
        // Arrays.sort(A);
        Arrays.sort(A, 3, 6);
        System.out.println(Arrays.toString(A));

        int X[] = new int[10];  // Arrays.fill() -> Used to fill an Array
        Arrays.fill(X, -1);
        System.out.println(Arrays.toString(X));

        String[] strArr = new String[10];
        Arrays.fill(strArr, "Aditya");
        System.out.println(Arrays.toString(strArr));

        int[] p = {10, 20, 30, 40};  // compare() -> Lexicography
        int[] q = {10, 20, 30, 40};
        System.out.println(Arrays.compare(p, q));
        /*
        compare(p, q)           compare(q, p)
        0 -> p == q             0 -> p == q
        1 -> p > q              1 -> q > p
        -1 -> p < q             -1 -> q < p
        */
        
        System.out.println(Arrays.equals(p, q));    // equals() -> returns true/ false

        // Arrays.mismatch(a, b) -> returns index where the element differs while comparing values in both the arrays
        System.out.println(Arrays.mismatch(p, q));
    }
}