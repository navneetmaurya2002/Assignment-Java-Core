package ifelse;
import java.util.*;
public class ageDetermination {
public static void youngP(int a1,int a2,int a3)
{
    if(a1<a2 && a1<a3)
    {
        System.out.println("The First Person is Youngest");
    }
    else if(a2<a1 &&a2<a3)
    {
        System.out.println("The Second Person is Youngest");
    }
    else if(a3<a1 && a3<a2)
    {
        System.out.println("The Third Person is Youngest");
    }
    
}
public static void oldP(int a1,int a2,int a3)
{
    if(a1>a2 && a1>a3)
    {
        System.out.println("The First Person is Oldest");
    }
    else if(a2>a1 && a2>a3)
    {
        System.out.println("The Second Person is Oldest");
    }
    else if(a3>a2 && a3>a1)
    {
        System.out.println("The Third Person is Oldest");
    }
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of First person:");
        int a1=sc.nextInt();
        System.out.println("Enter the age of Second person:");
        int a2=sc.nextInt();
        System.out.println("Enter the age of Third person");
        int a3=sc.nextInt();
        youngP(a1, a2, a3);
        oldP(a1, a2, a3);
    }
}
