import java.io.*;
import java.util.*;

interface CreaditCardInterface
{
    public int viewCreditAmount();
    public void useCard();
    public void payCredit();
    public void increaseLimit();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}
class SilverCardCustomer implements CreaditCardInterface
{
    String name;
    int cardNo;
    double creditAmount;
    double creditLimit=50000.0;

    SilverCardCustomer(String name,int cardNo,double creditAmount)
    {
        this.name=name;
        this.cardNo=cardNo;
        this.creditAmount=creditAmount;
    }
    int viewCreditAmount()
    {
        return creditAmount;
    }
    
    void useCard(int credit)
    {
        creditAmount+=credit;
    }
    void payCredit(int pay)
    {
        creditAmount-=pay;
    }

}
class GoldCardCustomer extends SilverCardCustomer
{
    double creditLimit = 100000.0;
   GoldCardCustomer(String name,int cardNo,double creditAmount)
   {
    super(name,cardNo,creditAmount);
   }
    void useCard(int credit)
    {
        creditAmount+=credit;
    }
    void payCredit(int pay)
    {
        creditAmount-=pay;
    }

}
class A2{
    public static void main(String args[])
    {

    }
}