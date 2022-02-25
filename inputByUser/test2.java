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
public class test2 {
    int reverse;
    public int reverse(int n)
    {
    int remainder=0;
        while(n!=0)
    {
     remainder=n%10;
     n/=10;
     reverse=10*reverse+remainder;
    }
    return reverse;
    }
    
    public static void main(String[] args) {
     test2 obj=new test2(); 
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to get its reverse:");
     int num=sc.nextInt();
        System.out.println("The reverse of the given number is:"+obj.reverse(num));
    }
}
