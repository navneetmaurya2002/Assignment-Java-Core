/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.*;
public class checkSquare {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        int len=sc.nextInt();
        System.out.print("Enter the breadth of rectangle :");
        int bth=sc.nextInt();
        if( len==bth)
        {
            System.out.println("The given value forms a square.");
        }
        else{
            System.out.println("The given value forms a rectangle.");
        }
                
    }
}
