// this keyword - refers to the current instance you are working with

/*
1. Distinguishing instance and local variables
2. Constructor chaining
*/

class Cat
{
    String name;
    int age;
    String breed;

    Cat() {}

    Cat(String name, int age, String branch)
    {
        this.name = name;   // this.name -> c1.name (if c1 is object)
        this.age = age;
        this.breed = branch;
    }

    void printThis()
    {
        System.out.println(this);
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Cat c1 = new Cat("Alice", 4, "Persion");
        System.out.println(c1);
        c1.printThis();

        Cat c2 = new Cat();
        System.out.println(c2);
        c2.printThis();
    }    
}