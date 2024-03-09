// Note - You can have CONSTRUCTORS in the abstract class

abstract class Animal
{
    abstract void introduce();  // abstract method

    String name;
    int age;

    Animal(String name, int age)    // constructor
    {
        this.name = name;
        this.age = age;
    }

    void showDetails()     // concrete method
    {
        System.out.println(name + " " + age);
    }
}

class Cat extends Animal
{
    Cat(String name, int age)   // constructor chaining
    {
        super(name, age);
    }
    void introduce()
    {
        System.out.println("Hey, I am a Cat");
    }
}

class Elephant extends Animal
{
    Elephant(String name, int age)  // constructor chaining
    {
        super(name, age);
    }
    void introduce()
    {
        System.out.println("Hey, I am an Elephant");
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Cat c1 = new Cat("Alice", 19);
        c1.introduce();
        c1.showDetails();

        Elephant e1 = new Elephant("Don", 20);
        e1.introduce();
        e1.showDetails(); 
    }    
}