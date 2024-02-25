// Setter Methods

class Student
{
    String name;
    String roll;
    double cgpa;
    
    static String college = "AEC";

    void setValues(String n, String rno, double mks)
    {
        roll = rno;
        name = n;
        cgpa = mks;
    }
    void getDetails()
    {
        System.out.println(name + " " + roll + " " + cgpa + " " + college);
    }
}

public class Example 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        s1.setValues("Aditya", "22A91A05F9", 8.4);     // An explicit method call
        s1.getDetails();
    }
}