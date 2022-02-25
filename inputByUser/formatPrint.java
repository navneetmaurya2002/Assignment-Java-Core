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
public class formatPrint {
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name :");
         String name=sc.next();
        System.out.print("Enter Rollno:");
         int rollno=sc.nextInt();
        System.out.print("Enter the number of interest to enter:");
        int n=sc.nextInt();
        System.out.print("Enter the field of interest: ");
        String[] arr=new String[n];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("");
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Interest:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(i+1+". "+arr[i]+" ");
        }
        System.out.println("");
    }
}
