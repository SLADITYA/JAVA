abstract class Bank 
{
    abstract void printInterestRate();
    abstract void printIFSC();
    abstract void printBranchName();  
}

// CanaraBank is made as abstract class as this class doesn't contain the implementations of printIFSC() and printBranchName(); 

abstract class CanaraBank extends Bank
{
    void printInterestRate()
    {
        System.out.println(7.6);
    }
}

class CanaraBankSurampalem extends CanaraBank
{
    /*
    void printInterestRate()    // overriding
    {
        System.out.println(9.6);
    }
    */
    void printIFSC()
    {
        System.out.println("CANB837427");
    }
    void printBranchName()
    {
        System.out.println("Surampalem");
    }
}

public class Example 
{
    public static void main(String[] args) 
    {
        CanaraBankSurampalem b1 = new CanaraBankSurampalem();
        
        b1.printBranchName();
        b1.printIFSC();
        b1.printInterestRate();
    }    
}