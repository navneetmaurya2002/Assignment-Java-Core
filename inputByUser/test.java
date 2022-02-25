/*
1. write a program to do the following using encapsulation. 
accept name no and ac bal from user , do the 10 transaction and accordingly display the final amount


*/
package inputByUser;
import java.util.*;

public class test {
    
    private int accNo;
    private double accBal;
    private String name;
    
    Scanner sc=new Scanner(System.in);
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        System.out.print("Enter the name:");
        name=sc.next();
        this.name=name;
    }
    public int getAccNo()
    {
        return accNo;
    }
    public void setAccNo(int accNo)
    {
        System.out.print("Enter the Account Number:");
        accNo=sc.nextInt();
        this.accNo=accNo;
    }
    public double getAccBal()
    {
        return accBal;
    }
    public void setAccBal(double accBal)
    {
        System.out.print("Enter the current account balance:");
        accBal=sc.nextDouble();
        this.accBal=accBal;
    }
    public void transaction()
    {
        {
        System.out.print("Want to transact the money");
        System.out.println("1. Yes");
        System.out.println("2. NO");
         int option=sc.nextInt(); 
        if(option==1)
        {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            int opt=sc.nextInt();
            if(opt==1)
            {
                System.out.print("Enter the amount to deposit:");
                int bal=sc.nextInt();
                accBal+=bal;
            }
            else if(opt==2)
            {
                System.out.print("Enter amount to withdraw:");
                int bal=sc.nextInt();
                if(bal>accBal)
                {
                    System.out.println("Not enough money for withdrawl");
                }
                else
                {
                    System.out.println("Your money is withdrawed:");
                    accBal-=bal;
                }
            }
            else
            {
                System.out.println("Enter the proper option!!");
            }

        }
        else if(option==2)
        {
            System.out.println("ThankYou !!!");
        }
        
    }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        test obj=new test();
        obj.setName("");
        obj.setAccNo(0);
        obj.setAccBal(0);
        System.out.println("Enter how many times to do the transaction:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        obj.transaction();
        }
        System.out.println("");
        System.out.println("Name:"+obj.getName());
        System.out.println("Account Number:"+obj.getAccNo());
        System.out.println("Account balance:"+obj.getAccBal());
        
    }
}
