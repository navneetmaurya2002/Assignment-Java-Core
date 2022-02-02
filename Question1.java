/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;
import java.util.Scanner;
/**
 *
 * @author navneet
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q1_input q1=new Q1_input();
        System.out.print("Enter your Name:");
        q1.name=sc.nextLine();
        System.out.print("Enter your Account Number:");
        int accNo=sc.nextInt();
        q1.setAccNO(accNo);
        System.out.print("Enter your Account Balance:");
        int accBal=sc.nextInt();
        q1.setAccBal(accBal);   
        q1.Calculation();
        System.out.println("Name:"+q1.name);
        System.out.println("Account Number:"+q1.getAccNO());        
        System.out.println("Account Balance:"+q1.getAccBal());

        
    }
}
