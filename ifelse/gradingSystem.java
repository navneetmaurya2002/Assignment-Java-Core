package ifelse;
import java.util.*;
public class gradingSystem {
    int marks;
    Scanner sc=new Scanner(System.in);
    public void acceptMarks()
    {
        System.out.print("Enter the marks:");
        marks=sc.nextInt();
        System.out.print("Grade Received:");
    }
    public void checkCondition()
    {
        if(marks>80)
        {
            System.out.println("A");
        }
        else if(marks>60 &&marks<=80)
        {
            System.out.println("B");
        }
        else if(marks<60 && marks>=50)
        {
            System.out.println("C");
        }
        else if(marks<50 &&marks>=45)
        {
            System.out.println("D");
        }
        else if(marks<45 && marks>=25)
        {
            System.out.println("E");
        }
        else if(marks<25)
        {
            System.out.println("F");
        }
    }
    public static void main(String[] args) {
        gradingSystem obj=new gradingSystem();
        obj.acceptMarks();
        obj.checkCondition();
    }
}
