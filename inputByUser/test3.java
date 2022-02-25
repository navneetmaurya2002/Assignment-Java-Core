/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputByUser;
import java.util.*;
/**
 *
 * @author navneet
 */
abstract class calculation{
    abstract void calculate();
    abstract void calculate(int n);
}
public class test3 extends calculation{
   Scanner sc=new Scanner(System.in);
   void calculate()
   {
       System.out.println("Enter the number to calculate the factorial");
       int n=sc.nextInt();
       int fact=1;
       for(int i=1;i<=n;i++)
       {
       fact*=i;
       }
       System.out.println("The factorial of the number is :"+fact);
   }
   
   void calculate(int n)
   {
       
       for(int i=2;i<=n/2;i++)
       {
           if(n%i==0)
       {
           System.out.println("Number is not prime."); 
       }
           else if (n==1 ||n==0)
           {
               System.out.println("Number is not prime.");
           }
           else 
           {
               System.out.println("Prime Number.");
           }
       }
   }
    public static void main(String[] args) {
       test3 obj=new test3();
       Scanner sc=new Scanner(System.in);
        System.out.println("Choose the option from list:");
        System.out.println("1. Factorial");
        System.out.println("2. Prime Number");
       int opt=sc.nextInt();
        if(opt==1)
       obj.calculate();
        else if(opt==2)
        {
            System.out.println("Enter the number to check prime:");
            int n=sc.nextInt();
            obj.calculate(n);
    }
        else
        {
            System.out.println("Choose Proper Option!!!");
        }
    }

   
}
