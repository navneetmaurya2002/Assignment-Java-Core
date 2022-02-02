
package java_test;
import java.util.Scanner;
/**
 *
 * @author navneet
 */
abstract class opt1{
   abstract void fact();
   abstract void isPrime();
    }

public class Question3 extends opt1 {
    public static Scanner sc=new Scanner(System.in);
    @Override
    void fact()
    {
        int fact=1,num;
        System.out.print("Enter the number to get factorial:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("The factorial of the number is:"+fact);
    }
    @Override
    void isPrime()
    {
        int num;
        boolean flag=true;
        System.out.print("Enter the number :");
        num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
        if(num%i==0)
        {
            flag=false;
        break;
        }
        }
        if(flag==true)
        {
            System.out.println("Not Prime number");
        }
        else 
            System.out.println("Prime number");
    }
    public static void main(String[] args) {
        Question3 q3=new Question3();
        System.out.println("Select the option to process: \n 1. Factorial \n 2. Prime Number");
        int opt=sc.nextInt();
        switch (opt) {
            case 1:
                q3.fact();
                break;
            case 2:
                q3.isPrime();
                break;
            default:
                System.out.println("The selected option is Wrong");
                break;
        }
    }
}
