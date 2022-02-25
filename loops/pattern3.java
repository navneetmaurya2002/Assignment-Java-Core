package loops;
/*
     *
    * *
   * * *
  * * * *
 * * * * *
*/
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows;
        System.out.print("Enter the numbers of rows to print pattern:");
        rows=sc.nextInt();
        for(int i=0;i<=rows;i++)
        {
            for(int j=rows-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
