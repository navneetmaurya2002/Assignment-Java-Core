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
public class sumOfDigits {
    Scanner sc=new Scanner(System.in);
    static int n;
    public void accept()
    {
        System.out.print("Enter the number to show the sum of digits:");
        n=sc.nextInt();
    }
    public int sum1(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
    sumOfDigits obj=new sumOfDigits();
    obj.accept();
    obj.sum1(n);
        System.out.println("The sum of the digits in given number is:"+obj.sum1(n));
    }
}
