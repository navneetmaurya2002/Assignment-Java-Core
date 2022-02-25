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
public class recusionReverse {
   static  int n;
    public void reverse(int n)
    {
        if(n<10)
        {
            System.out.println(n);
        }
        else
        {
            System.out.print(n%10);
            reverse(n/10);
        }
    }
    public static void main(String[] args) {
        recusionReverse obj=new recusionReverse();
         System.out.print("Enter the number to reverse:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        obj.reverse(n);
    }
}
