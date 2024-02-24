// Functions (User Defined Method)

public class Example
{
    static void sayHello()  // static method
    {
        System.out.println("Hello All");
    }
    boolean isFactor(int a, int b)  // instance method
    {
        return a % b == 0;
    }
    public static void main(String[] args) 
    {
        sayHello();  // method call
        Example obj = new Example();   // object creation
        System.out.println(obj.isFactor(10, 2));    // instance method call
    }
}