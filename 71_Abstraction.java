abstract class Animal
{
    abstract void introduce();  // abstract method
}

class Cat extends Animal
{
    void introduce()
    {
        System.out.println("Hey, I am a Cat");
    }
}

class Elephant extends Animal
{
    void introduce()
    {
        System.out.println("Hey, I am an Elephant");
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        Cat c1 = new Cat();
        c1.introduce();
        Elephant e1 = new Elephant();
        e1.introduce(); 
    }    
}