/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepcoding;

import java.util.Scanner;

/**
 *
 * @author admin
 */
abstract class inverse{
    abstract int inverse(int n);
}
public class inverseNumber extends inverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
      inverse in=new inverseNumber();
        System.out.println(in.inverse(n)); 
    }

    @Override
    int inverse(int n) {
        int reverse=0;
        int OrgPos=1;
        while(n>0)
        {
           int OrgDig=n%10;
            n=n/10;
            reverse+=OrgPos*(int)Math.pow(10,OrgDig-1);
            OrgPos++;
        }
      return reverse;
        
    }
   
            
}
