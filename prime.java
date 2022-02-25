import java.util.Scanner;

public  class prime{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int start, last;
		System.out.println("Enter the first and final number to print prime number:");
		start=sc.nextInt();
		last=sc.nextInt();
		for(int i=start;i<=last;i++)
		{
			if(prime(i))
			{
				System.out.print(i+" ");
			}
		}

	}
	static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}