import java.util.*;
import java.io.*;
public class fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,i,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range to get Output:");
        count=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<=count;i++)
        {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        sc.close();
    }
}
