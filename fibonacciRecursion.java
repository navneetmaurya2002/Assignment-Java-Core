import java.util.*;
public class fibonacciRecursion {
    public static int n1=0,n2=1,n3;
    public static void fibonacci(int count)
{
    for(int i=1;i<count-1;i++)
  {
    n3=n1+n2;
    n1=n2;
    n2=n3;
    System.out.print(" "+n3);
}
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci(count);        
    }
}   
