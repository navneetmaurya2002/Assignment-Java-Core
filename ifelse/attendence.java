package ifelse;
import java.util.*;
public class attendence {
    public static void accept_details(int held,int attended)
    {
        System.out.print("The percentage of the class attended is:");
        double percent=(attended*100)/held;
        System.out.println(percent);
        if(percent<75)
        {
            System.out.println("You are not allowed to sit in exam.");
        }
        else{
            System.out.println("You can sit in exam");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of class held:");
        int held=sc.nextInt();
        System.out.print("Enter the Number of class attended:");
        int attend=sc.nextInt();
        accept_details(held, attend);
    }
}
