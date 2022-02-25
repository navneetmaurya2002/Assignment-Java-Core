import java.util.Scanner;

public class isPrime2{
	static boolean isPrime2(int num)
	{
		if(num<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%2==0)
				{
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the number to check:");
		n=sc.nextInt();
		if(isPrime2(n))
		{
		System.out.println("The number is Prime.");	
		}
		else{
			System.out.println("The number is Not Prime.");
		}
	}
}