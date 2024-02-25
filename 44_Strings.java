// String Buffer in Java

// Strings -> Immutability

// Mutable Strings -> StringBuffer & StringBuilder

// StringBuffer -> Thread Safe      StringBuilder -> Thread Unsafe

public class Example
{
    public static void main(String[] args) 
    {
        StringBuffer sb1 = new StringBuffer("hello");
        
        System.out.println(sb1);

        sb1.append(1234);    // appends 1234 at the end of hello
        sb1.append(12.3);

        sb1.setCharAt(0, 'p');  //replaces the char at 0th index with 'p'

        sb1.deleteCharAt(0);    // removes character at 0th index

        sb1.insert(3, "xyz");   // inserts xyz from 3rd index
        sb1.insert(2, "789");

        System.out.println(sb1);

        String outpuString = new String(sb1);   // Converting a StringBuffer to String

        System.out.println(outpuString.length());

        StringBuilder sb2 = new StringBuilder("hello");     // similar to StringBuffer
        
        System.out.println(sb2);

        sb2.append(1234);    // appends 1234 at the end of hello
        sb2.append(12.3);

        sb2.setCharAt(0, 'p');

        sb2.deleteCharAt(0);

        System.out.println(sb2);
    }
}