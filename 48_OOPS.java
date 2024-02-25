/*
Create a class named Circle with One non-static / instance variable called as radius

3 non static / instance method() i.e printDiameter(), printArea(), printPerimeter()
*/

class Circle
{
    double radius;

    static final double PI = 3.14;

    void printDiameter()
    {
        System.out.println(2 * radius);
    }
    void printArea()
    {
        System.out.println(3.14 * radius * radius);
    }
    void printPerimeter()
    {
        System.out.println(2 * 3.14 * radius);
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle();
        c1.radius = 3.7;
        c1.printDiameter();
        c1.printArea();
        c1.printPerimeter();
    }    
}