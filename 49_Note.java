// Duplication of an object

class Cat
{
    String name;
    int age;
}

public class Example
{
    static void change(Cat c)   // call by reference
    {
        c.name = "xyz";
    }
    public static void main(String[] args) 
    {
        Cat c1 = new Cat();
        c1.name = "Alice";
        c1.age = 17;
        Cat c2 = c1;    // Deep Copy
        c2.name = "Bob";
        System.out.println(c1 + " " + c2);
        change(c1);
        System.out.println(c1.name);
    }
}