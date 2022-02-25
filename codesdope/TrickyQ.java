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
public class TrickyQ {
   public void sum()
   {
        System.out.println((((2345+8)/3)%5)*5);
   }
   public void assignSum()
   {
       int num=2345;
       System.out.println(((((num+=8)/3)%5)*5));
   }
    public static void main(String[] args) {
   TrickyQ obj=new TrickyQ();
   obj.sum();
   obj.assignSum();
    }
    
}
