// Generic Methods - Generic Methods works only for Wrapper classes

class Cat
{
    String name;
    int age;

    Cat() {}

    Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "This is " + name + "(" + age + ")";
    }
}

public class Example
{
    static <T> void printArray(T[] arr)     // Generic Method
    {
        for (T val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Character arr1[] = {'z', '?', 'x', 'y'};

        Integer arr2[] = {10, 20, 30, 40, 50};

        printArray(arr1);
        printArray(arr2);

        Cat[] cats = {new Cat("Alice", 7), new Cat("Bob", 4)};

        printArray(cats);
    }
}