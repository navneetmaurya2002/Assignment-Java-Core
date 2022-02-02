
package java_test;

import java.util.Scanner;

/**
 *
 * @author navneet Question 1: Q1: WAP to do the following process using
 * encapsulation. accept name no and ac balance from user ,do the 10
 * transactions and accordingly display the final amount
 *
 */
public class Q1_input {

    private int accNO, accBal;   // account Number and account Balance
    String name; // for name
    int ch;  // for choice
    int amount; // for amount
    public static Scanner sc = new Scanner(System.in); // static declaration of the Scanner class
    // setter and getter for private fields

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public int getAccBal() {
        return accBal;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    // Method for Calculation
    public void Calculation() {
        int rep;
        do {
            
            System.out.println("Choose the option to perform operation: \n 1.Debit Cash \n 2. Credit Cash \n 3.Check Balance");
            ch = sc.nextInt();
            System.out.print("Enter the Amount:");
            amount = sc.nextInt();
            switch (ch) {
                case 1:
                    accBal -= amount;
                    break;
                case 2:
                    accBal+=amount;
                    break;
                case 3:
                    System.out.print("Your Account Balance is :"+accBal);
                    break;      
            }
            System.out.println("Do you want to process more Transaction: /n 1. Yes /n 2. No");
            rep=sc.nextInt();
        } while (rep==1);
    }
}
