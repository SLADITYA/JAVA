// Introduction to OOPS

class Person
{
    String name;    // member variable / attributes 
    int age;        // non static / instance member

    void printDetails()     // non static / instance method
    {
        System.out.println("My name is: " + name + " and I am " + age + " years old");
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Person p1 = new Person();       // creating an object of Person
        p1.name = "Harry";
        p1.age = 17;
        p1.printDetails();

        Person p2 = new Person();
        p2.name = "Ron";
        p2.age = 18;
        p2.printDetails();
    }
}