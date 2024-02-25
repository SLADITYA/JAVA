// Introduction to OOPS (Example 2)

class Rectangle
{
    double length, width;   // member variables

    void printArea()    // member functions
    {
        System.out.println("Area is: " + length * width);
    }
    void printPerimeter()
    {
        System.out.println("Perimeter is: " + 2 * (length + width));
    }
}

public class Example 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        r1.width = 3.4;
        r1.length = 1.2;
        r1.printPerimeter();
        r1.printArea();

        Rectangle r2 = new Rectangle();
        r2.width = 2.4;
        r2.length = 1.8;
        r2.printPerimeter();
        r2.printArea();
    }   
}