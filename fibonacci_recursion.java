import java.util.Scanner;

public class fibonacci_recursion{
	static Scanner sc=new Scanner(System.in);
	static int n1=0,n2=1,n3,count;
	static void series()
	{
		if(count-2>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			count--;
			series();
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the number of items in series:");
		count=sc.nextInt();
		System.out.print(n1+" "+n2);
		series();
	}
}