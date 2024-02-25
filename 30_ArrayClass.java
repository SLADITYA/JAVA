// Usage of Array Class

import java.util.Arrays;

public class Example 
{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        
        int[] b = a;    // Deep Copy - Changes made in arr a will be reflected in arr b as well
        
        int[] c = a.clone();    // Shallow Copy - Changes made in arr a will not be reflected on arr c
        
        a[1] = 2000;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        String[] names = {"tokyo", "nairobi", "professor"};
        String[] new_names = names.clone();
        new_names[2] = "berlin";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(new_names));
    }
}