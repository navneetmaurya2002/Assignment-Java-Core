package inputByUser;
import java.util.*;
public class checkCondition2 {
 static int a,b;
  public static Scanner sc=new Scanner(System.in);
  static public void acceptNo()
  {
      System.out.println("Check the following condition:");
      System.out.println("1. a < 50");
      System.out.println("2. a < b");
      System.out.print("Enter the value of a:");
      a=sc.nextInt();
      System.out.println("Enter the value of b:");
      b=sc.nextInt();
      if(a<50 && a<b)
      {
          System.out.println("Both the conditon is true.");
      }
      else if(a<50)
      {
          System.out.println("First condition is true.");
      }
      else if (a<b)
      {
          System.out.println("Second Condition is true.");
      }
      else 
      {
          System.out.println("None of the condition is true. ");
      }
  }
    public static void main(String[] args) {
        acceptNo();
    }
}
