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
public class calculatePercent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained out of 100:");
        System.out.print("subject 1:");
        int s1=sc.nextInt();
        System.out.print("subject 2:");
        int s2=sc.nextInt();
        System.out.print("subject 3:");
        int s3=sc.nextInt();
        int total=s1+s2+s3;
        System.out.println("The total marks obtained is :"+total+" from 300 marks.");
        double percent=(total*100)/300;
        System.out.println("The percentage obtained is :"+percent);
    }
}
