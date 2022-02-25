package ifelse;
import java.util.*;
public class workPreference {
    public static Scanner sc=new Scanner(System.in);
   static char sex,status;
   static int age;
    public static void input()
    {
        System.out.print("Enter the sex Male or Female:");
        sex=sc.next().charAt(0);
        System.out.print("Enter the Marital Status Yes or No:");
        status=sc.next().charAt(0);
        System.out.print("Enter the age:");
        age=sc.nextInt();
    }
   public static void check(char sex,char status,int age)
   {
   if(sex=='M'||sex=='m')
   {
       if(age>20 && age<40)
       System.out.println("The Employee can work anywhere.");
       else if(age>40 && age<60)
       {
            System.out.println("The Employee can work only in Urban areas");
       }
       else {
           System.out.println("ERROR");
       }
       
   }
  
   else if(sex=='F'||sex=='f')
           {
            System.out.println("The Employee can work only in Urban areas");
           }
   }
    public static void main(String[] args) {
        input();
        check(sex, status, age);
    }
}
