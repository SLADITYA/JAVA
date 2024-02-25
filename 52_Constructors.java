// Constructor Example 1

class Student
{
    Student()      // default - no parametric constructor
    {
        System.out.println("Hey I got invoked ...");
    }
}

public class Example 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1 + " " + s2);
    }
}