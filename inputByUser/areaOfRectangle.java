
package inputByUser;
import java.util.*;
/**
 *
 * @author navneet
 */
public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1,n2;
        System.out.print("Enter the first double number:");
        n1=sc.nextDouble();
        System.out.print("Enter the second double number:");
        n2=sc.nextDouble();
        int area=(int)(n2*n1);
        System.out.println("The area of the rectangle is :"+area);
    }
}
