package ifelse;
import java.util.*;
public class absoluteVal {
    public static void num(int n)
    {
        System.out.print("The absolute is:");
        if(n<0)
        {
          
            System.out.println(n*-1);
        }
        else {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to get absolute value of it:");
        int n=sc.nextInt();
        num(n);
    }
}
