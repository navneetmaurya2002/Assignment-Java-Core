package ifelse;
import java.util.*;
/**
 *
 * @author navneet
 */
public class bonus {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary=sc.nextInt();
        System.out.print("Enter the year of service:");
        int year=sc.nextInt();
        System.out.println("The net bonus amount is:"+bonus(salary, year));
    }
   static public double bonus(int sal,int year)
    {
        double bonus=0.0;
        if(year>5)
        {
            bonus=sal*0.05;
        }
        else
        {
            bonus=0;
        }
        return bonus;
    }
            
}
