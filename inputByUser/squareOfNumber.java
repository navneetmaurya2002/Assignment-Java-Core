/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputByUser;
import java.util.*;
/**
 *
 * @author navneet
 */
public class squareOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calcutate the square:");
        int num=sc.nextInt();
        System.out.println("The square of the number is:"+(int)Math.pow(num, 2));
    }
}
