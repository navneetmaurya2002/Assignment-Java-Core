package ifelse;
import java.util.*;
/**
 *
 * @author navneet
 */
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year to check :");
        int year=sc.nextInt();
      if(year%4==0 && year%100!=0 ||year%400==0)
      {
          System.out.println("Leap year.");
      }
      else
      {
          System.out.println("Not a Leap Year.");
      }
    }
}
