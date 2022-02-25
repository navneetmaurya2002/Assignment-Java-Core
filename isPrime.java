import java.util.Scanner;

public class isPrime{
	static void isPrime(int num)
	{
		int flag=0;
		if(num==0 || num==1)
		{
			System.out.println("Given Number is not Prime");
		}
		else{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0)
		{
			System.out.println("The Given number is not Prime.");
		}
		else if(flag==1)
		{
			System.out.println("The Given number is Prime.");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Check: ");
		int n=sc.nextInt();
		isPrime(n);
	}
}