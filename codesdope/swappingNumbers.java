/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesdope;

/**
 *
 * @author navneet
 */
public class swappingNumbers {
   int a=6,b=8;
    public void withvariable()
    {
        System.out.println("The values of a and b before swapping:"+a+" and "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("The value of the numbers after swapping :"+a+" and "+b );
    }
    public void withoutvariable()
    {
        System.out.println("The value of the nubmers before swapping :"+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("The value after swapping:"+a +" and "+b);
    }
    public static void main(String[] args) {
       swappingNumbers obj=new swappingNumbers();
       obj.withvariable();
       obj.withoutvariable();
       
    }
    
}
