// Interfaces are used to achieve Multiple Inheritance

interface Inf1
{
    void method1();
    void show();
}

interface Inf2
{
    void method2();
    void show();
}

class ABC implements Inf1, Inf2
{
    public void show() {}
    public void method1() {}
    public void method2() {}
}

public class Example
{
    public static void main(String[] args) {}
}