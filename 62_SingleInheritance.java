// Single Inheritance

class Person
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

class Student extends Person
{
    String studentId;
    String branch;
    String college;

    Student() {};

    Student(String name, int age, String gender, String studentId, String branch, String college) {
        // this.name = name;
        // this.age = age;
        // this.gender = gender;
        super(name, age, gender);
        this.studentId = studentId;
        this.branch = branch;
        this.college = college;
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Aditya", 18, "Male", "xyz" ,"AEC", "CSE");
        s1.showDetails();
    }
}