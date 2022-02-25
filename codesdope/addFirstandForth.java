/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesdope;
import java.util.*;
/**
 *
 * @author navneet
 */
public class addFirstandForth {
static int num;
    public void acceptNumber()    
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter four digit number to find the sum of 1st and 4th digit :");
   num=sc.nextInt();
}
public int sum(int num)
{
    int first,second,third,fourth,sum=0;
    first=num/1000;
    num=num%1000;
    second=num/100;
    num=num%100;
    fourth=num%10;
    sum=fourth+first;
    return sum;
}
    public static void main(String[] args) {
        addFirstandForth obj=new addFirstandForth();
        obj.acceptNumber();
        System.out.println("The sum of the first and the fourth digit of the given number is :"+obj.sum(num));
    }
}
