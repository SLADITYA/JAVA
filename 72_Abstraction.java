import java.util.Scanner;

abstract class Shape
{
    double area;

    abstract void takeInput();
    abstract void calculateArea();
    
    void displayArea()  // concrete method
    {
        System.out.println(area);
    }
}

class Square extends Shape
{
    double side;

    void takeInput()
    {
        Scanner sc = new Scanner(System.in);
        side = sc.nextDouble();
    }
    void calculateArea()
    {
        area = side * side;
    }
    /*
    void displayArea()   // implementation is the same
    {
        System.out.println(area);
    }
    */
}

class Rectangle extends Shape
{
    double length, width;

    void takeInput()
    {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    void calculateArea()
    {
        area = length * width;
    }
    /*
    void displayArea()       // implementation is the same
    {
        System.out.println(area);
    }
    */
}

public class Example
{
    public static void main(String[] args) 
    {
        Square s1 = new Square();
        s1.takeInput();
        s1.calculateArea();
        s1.displayArea();

        Rectangle r1 = new Rectangle();
        r1.takeInput();
        r1.calculateArea();
        r1.displayArea();
    }
}