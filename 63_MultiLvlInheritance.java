// Multi Level Inheritance

class Person    // Grand Parent
{
    String name;
    int age;
    String gender;

    Person() {}

    Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void showDetails()
    {
        System.out.println(name + " " + age + " " + gender);
    }
}

class Student extends Person    // Parent
{
    String studentId;
    String branch;
    String college;

    Student() {};

    Student(String name, int age, String gender, String studentId, String branch, String college) 
    {
        super(name, age, gender);
        this.studentId = studentId;
        this.branch = branch;
        this.college = college;
    }
}

class Intern extends Student    // Child
{
    String internId;
    double salary;

    Intern() {}

    Intern(String name, int age, String gender, String studentId, String branch, String college, String internId, double salary)
    {
        super(name, age, gender, studentId, branch, college);
        this.internId = internId;
        this.salary = salary;
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Intern i1 = new Intern("Alice", 12, "Male", "xyz", "IT", "AEC", "CSE", 1000);
        i1.showDetails();
    }
}