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
public class sumAndproduct {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1=sc.nextInt();
        System.out.print("Enter the second number:");
        n2=sc.nextInt();
        System.out.println("Sum of two numbers :"+(n1+n2));
        System.out.println("Product of two numbers :"+(n1*n2));
    }
}
