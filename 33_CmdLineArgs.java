/*
Command Line Arguments - Arguments that you send to a main method/ function.

compile - javac filename.java

run - java classname

function/ method
int getSum()

main method
public static void main(String[] args)
String array

*/

public class Example
{
    public static void main(String[] args) 
    {
        System.out.println(args.length);
        int a = Integer.parseInt(args[0]);  // 10 -> "10"
        int b = Integer.parseInt(args[1]);
        System.out.println(a * b);
    }
}

/*
 * javac Example.java
 * java Example 10 20
 * Output -> 2 200
 * 
 * If you didnot pass any arguments it sends an Index out of bounds error at CommandLineArguments.main
 */

 // Note - Mostly used in networking. It is mostly not used in general programming