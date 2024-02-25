// Arbitary (Variable Sized) number of arguments to a function / method

public class Example
{
    static void add(int ... elements)   // elements = {10, 20}, {10, 20, 30}
    {
        int sum  = 0;

        for (int i = 0; i < elements.length; i++) 
        {
            sum += elements[i];
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) 
    {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40, 50);
        add(10, 20, 30, 40, 50, 60);
    }
}

// Arrays.asList() -> Function with a Combination of Generic Methods and Arbitary no of arguments