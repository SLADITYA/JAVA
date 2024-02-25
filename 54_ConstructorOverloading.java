// Constructor Overloading

class Employee
{
    String name;
    int age;
    int empId;
    double salary;
    String org;

    Employee() {}

    Employee(String n)
    {
        name = n;
    }

    Employee(String n, int a)
    {
        name = n;
        age = a;
    }

    Employee(String n, int a, int e)
    {
        name = n;
        age = a;
        empId = e;
    }

    Employee(String n, int a, int e, double s, String o)
    {
        name = n;
        age = a;
        empId = e;
        salary = s;
        org = o;
    }

    void printDetails()
    {
        System.out.println(name + " " + age + " " + empId + " " + salary + " " + org);
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Employee e3 = new Employee("Kiran", 30, 123, 100000.00, "THub");
        Employee e2 = new Employee("Pavan", 27);
        Employee e1 = new Employee();

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}