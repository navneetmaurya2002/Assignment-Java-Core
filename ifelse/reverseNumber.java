package ifelse;
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to get Reverse :");
        int n=sc.nextInt();
        int reverse=0;
        while(n!=0)
        {
            reverse=reverse*10+(n%10);
            n/=10;
        }
        System.out.println("Reverse Number is:"+reverse);
    
    }
    
}
