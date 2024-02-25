// Inheritance

class Person
{
    String name;
    int age;
    String gender;

    Person()
    {
        System.out.println("Hello from Person");
    }
}

class Student extends Person
{
    String studentId;
    String branch;
    String college;

    Student()
    {
        System.out.println("Hi from Student");
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Student obj = new Student();
        obj.name = "Alice";
        System.out.println(obj.name);
    }
}