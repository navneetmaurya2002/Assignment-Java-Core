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
public class percentage {
    public static void main(String[] args) {
        int total=90;
        int boys=total/2;
        int girls=total-boys;
        System.out.println("The total students in a class are:"+total);
        System.out.println("The boys in the class are:"+boys);
        System.out.println("The girls in the class are:"+girls);
        System.out.println("The 50% Students scored \'A\' grade ");
        System.out.println("The number of boys scored  \'A\' grade is 20");
        double perBoy=(20*100/45);
        double perGirl=100-perBoy;
        System.out.println("Percent of boys:"+perBoy);
        System.out.println("Percent of Girls"+perGirl);
        int  passedGirls=(int)(perGirl*45)/100;
        System.out.println("The number of girls scored \'A\' grade is:"+passedGirls);
    }
}
