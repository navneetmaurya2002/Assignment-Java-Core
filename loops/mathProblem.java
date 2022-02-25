package loops;
import java.util.*;
public class mathProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
                int counter=0;
        
        do{
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%2!=0)
            {
                n=(3*n+1);
            }
            counter++;
            System.out.println(counter+" n: "+(int)n);
        }
        }while(n==1);
        
    
                }
}
