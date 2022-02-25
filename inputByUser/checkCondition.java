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
public class checkCondition {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n1,n2,n3;
        boolean bool=false;
        do{
           
        System.out.println("Enter the first Number:");
      n1=sc.nextInt();
        System.out.println("Enter the second Number:");
        n2=sc.nextInt();
        System.out.println("Enter the third Number:");
        n3=sc.nextInt();
        if(n1>n2 && n1>n3)
        {
            System.out.println("n1 is greater than other numbers.");
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println("n2 is greater than other numbers.");
        }
        else if(n3>n1 && n3>n2)
        {
            System.out.println("n3 is greater than other numbers.");
        }
        else if (n1==n2 || n1==n3 || n2==n3)
        {
            System.out.println("All the numbers are equal");
        }
        
            System.out.println("Do you want to run this again :");
            System.out.println("1. Yes");
            System.out.println("2. NO");
            int opt=sc.nextInt();
            if(opt ==1)
            {
                bool=true;
            }
            else if(opt==2) 
            {
                bool=false;
            }
            else
                System.out.println("Enter the proper option.");
            
        }while(bool);    
    }
}
