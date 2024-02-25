// Method Overriding - Changing the behaviour of a method in different classes

class Parent
{
    void show()
    {
      System.out.println("Hey I am parent");
    }
}
  
class Child extends Parent
{
    void show()
    {
      System.out.println("Hey I am Child");
    }
}
  
public class Example
{
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.show();

        Parent p1 = new Parent();
        p1.show();
    }     
}