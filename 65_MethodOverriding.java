// Method Overriding (Example 2)

class Bank
{
    double getPersonalLoanInterest()
    {
        return 0.0;
    }
}

class SBI extends Bank
{
    double getPersonalLoanInterest()
    {
        return 7.0;
    }
}

class HDFC extends Bank
{
    double getPersonalLoanInterest()
    {
        return 8.0;
    }
}

public class Example
{
    public static void main(String[] args) 
    {
        SBI sbi = new SBI();
        double x = sbi.getPersonalLoanInterest();
    
        HDFC hdfc = new HDFC();
        double y = hdfc.getPersonalLoanInterest();
        
        System.out.println(x + " " + y);
    }
}