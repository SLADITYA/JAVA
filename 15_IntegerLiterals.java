// Integer Literals

/*  decimal -> base 10   (0 - 9)
    binary  -> base 2    (0, 1)
    octal   -> base 8    (0 - 7)
    hexa decimal -> base 16   (0 - 9, A - F)
*/

public class Example
{
    public static void main(String[] args) 
    {
        int intVar1 = 123;
        System.out.println(intVar1);
        // 0b -> prefix -> binary literal
        int intVar2 = 0b110;
        System.out.println(intVar2);
        // 0 -> prefix -> octal
        int intVar3 = 0123;
        System.out.println(intVar3);
        // 0x -> prefix -> hexa decimal
        int intVar4 = 0xA;
        System.out.println(intVar4);    
    }    
}