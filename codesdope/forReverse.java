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
public class forReverse {
    static int n,reverse;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the number to reverese:");
        n=sc.nextInt();   
    }
    public void reverse()
    {
       for(n=n;n!=0;n/=10)
       {
        int remainder;
        remainder=n%10;
        reverse=reverse*10+remainder;
       }
        System.out.println("The reverse number is:"+reverse);
    }
    public static void main(String[] args) {
        forReverse obj=new forReverse();
        obj.accept();
        obj.reverse();
    }
}
