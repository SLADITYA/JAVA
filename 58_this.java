// Constructor chaining - Process of calling one constructor from another constructor

/*
Within same class -> this()
From base class -> super()
*/

public class Example 
{
    String name;
    int age;
    double cgpa;
    String branch;

    Example(String name)
    {
        this.name = name;
    }
    Example(String name, int age)
    {
        this(name);
        this.age = age;
    }
    Example(String name, int age, double mks)
    {
        this(name, age);
        cgpa = mks;
    }
    Example(String name, int age, double cgpa, String branch)
    {
        this(name, age, cgpa);
        this.branch = branch;
    }

    public void displayValues() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) 
    {
        Example obj2 = new Example("Bob", 22);
        Example obj1 = new Example(" Alice");
        Example obj3 = new Example("John", 23, 3.47);
        Example obj4 = new Example("Mosh", 34, 8.9, "CSE");
        obj1.displayValues();
        obj2.displayValues();
        obj3.displayValues();
        obj4.displayValues();
    }
}