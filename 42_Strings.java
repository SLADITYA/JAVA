// String Methods in Java

public class Example
{
    public static void main(String[] args) 
    {
        String s = "Hello";    // You can access this string only with the help of method calls
        
        System.out.println(s.length());    // length() - to get the no of characters

        System.out.println(s.charAt(2));    // charAt(ind) - character at ind index

        System.out.println(s.toUpperCase());    // toUpperCase() - returns a new string where every character is of uppercase

        System.out.println(s.toLowerCase());

        System.out.println(s);   // Orginal String won't be changed as it's immutable
        
        System.out.println(s.contains("" + 'H'));   // returns true as Hello has H in it
        System.out.println(s.contains("" + "b"));   // returns false as there is no b

        System.out.println(s.indexOf('H'));

        System.out.println(s.lastIndexOf('l'));

        System.out.println(s.startsWith("Hel"));
        System.out.println(s.endsWith("llo"));

        System.out.println(s.substring(2));
        System.out.println(s.substring(1, 4));

        /*
        Compare String -> compareTo()
        negative -> s1 is smaller than s2
        0 -> s1 is equal to s2
        positive -> s1 is greater than s2
        */

        String s1 = "abc";    // 'c' 'e' -> 99 - 101  = -2
        String s2 = "abe";    // 'e' 'c' -> 101 - 99 = 2

        String p = "xyz";
        String q = "xyzaaaaa";

        System.out.println(s2.compareTo(s1));   // comparision takes place lexicographically
        System.out.println(s1.compareTo(s2));
        
        System.out.println(q.compareTo(p));    // comparision takes place based on their length

        System.out.println(p.equals(q));    // equals() -> true / false
    }    
}