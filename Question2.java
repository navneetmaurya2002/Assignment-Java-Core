
package java_test;

import java.util.Scanner;

/**
 *
 * @author navneet
 *
 *
 * Q2:WAP to accept the choice and do the following process using polymorphism
 * 1:Leap year or not 2:Reverse 3:Pattern1= pascal's triangle and sandglass
 * pattern
 *
 */
// class for leap year
class option1 {

    public static Scanner sc = new Scanner(System.in);

    public void process() {
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a Leap Year");
    }
}
// class for reverse number
class option2 extends option1 {
public void process()
{
    System.out.print("Enter the number to get its reverse:");
    int num=sc.nextInt();
    int reverse=0,remainder;
    while(num!=0)
    {
        remainder=num%10;
        reverse=reverse*10+remainder;
        num/=10;
    }
    System.out.println("The reverse number is:"+reverse);
}
}

class option3 extends option2 {
@Override
public void process()
{
   int rows,row,space,symbol;
    System.out.print("Enter the number of rows:");
    rows=sc.nextInt();
    for(row=1; row<rows;row++)
    {
        for(space=row;space<=rows;space++)
        {
            System.out.print(" ");
        }
        for(symbol=1;symbol<=row;symbol++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    
    // for lower part
    
    for(row=rows;row>=1;row--)
    {
        for(space=rows;space>=row;space--)
        {
            System.out.print(" ");
        }
        for(symbol=1;symbol<=row;symbol++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
class option4 extends option3 {
@Override
public void process()
{
    int rows, row, space, symbol;
    System.out.print("Enter the number of rows:");
    rows=sc.nextInt();
    // for upper triangle
    
    for(row=rows;row>0;row--)
    {
        for(space=1;space<=rows-row;space++)
        {
            System.out.print(" ");
        }
        for(symbol=row;symbol>=1;symbol--)
        {
            System.out.print("* ");
        }
        System.out.println("");        
    }
    
    // for lower triangle
     
    for(row=1;row<=rows;row++)
    {
        for(space=rows;space>row;space--)
        {
            System.out.print(" ");
        }
        for(symbol=1;symbol<=row;symbol++)
        {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
}

public class Question2 extends option3 {

    public static void main(String[] args) {
        int option;
        System.out.println("Choose the option to perform :\n 1. Leap year or Not "
                + "\n 2. Reverse"
                + "\n 3.Pascal's Triangle "
                + "\n 4. Sandglass ");
        option1 op1=new option1();
        option2 op2=new option2();
        option3 op3=new option3();
        option4 op4=new option4();
        option = sc.nextInt();
        
        switch (option) {
            case 1:
                op1.process();
                break;
            case 2:
                op2.process();
                break;
            case 3:
                op3.process();
                break;
            case 4:
                op4.process();
                break;
            default:
                break;
        }
    }
}
