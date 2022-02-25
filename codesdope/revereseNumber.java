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
public class revereseNumber {
    Scanner sc=new Scanner(System.in);
    static int n,reverse=0;
    public void accept()
    {
        System.out.println("Enter the number to reverse it :");
         n=sc.nextInt();
    }
    public int reverse(int num)
    {
        while(num!=0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num/=10;
        }
       return reverse; 
    }
    public static void main(String[] args) {
        revereseNumber obj=new revereseNumber();
        obj.accept();
        System.out.println("The reveres of the number is :"+obj.reverse(n));
    }
}
