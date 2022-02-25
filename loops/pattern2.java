package loops;
import java.util.Scanner;
/*
    *
   **
  ***
 ****
*****
*/
public class pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines to print pattern:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int row,cols;
        for(int i=0;i<rows;i++)
        {
            for(int j=2*(rows-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }  
}
