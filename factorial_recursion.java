import java.util.Scanner;

public class factorial_recursion{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number to find factorial:");
		num=sc.nextInt();
		System.out.println("The factorial of the given number is:"+fact(num));
	}
	
	static int fact(int n)
	{
	int fact=1;
	if(n==0)
	{
		return 1;
	}
for(int i=n;i>1;i--)
{
	fact*=i;
}	
	return fact;

	}
}