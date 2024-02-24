// Instance and Static Variables

class Student
{
    int age;    // instance variable
    String name, rollNumber;    // instance variable
  
    static String collegeName = "AEC";  // static variable

    // instance method -> can only be accessed with instance
    void printDetails()
    {
        System.out.println(age + " " + name + " " + rollNumber);
    }

    // static method -> can only be accessed using classname or object of that class
    static void printCollegeName()
    {
        System.out.println(collegeName);
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        System.out.println(Student.collegeName);
        Student s1 = new Student();    // creating an instance of Student class
        System.out.println(s1.collegeName);
    }
}