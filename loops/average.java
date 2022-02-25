package loops;

import java.util.*;

import java.io.Console;
import java.io.Writer;

public class average {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double avg;
        int sum=0;
        int i,num;
        System.out.print("Enter the value for iterations:");
        num=sc.nextInt();
        for (i=1; i <= num; i++) {
           int n=sc.nextInt();           
           sum+=n;
        }
        avg=sum/(i-1);
        System.out.println("The average of numbers is:"+avg);
    }
}
