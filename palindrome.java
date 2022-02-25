import java.util.Scanner;

public class palindrome{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num=sc.nextInt();
		int temp=num;
		if(reverse(num)==temp)
		{
			System.out.println("The entered number is palindrome.");
		}
		else{
			System.out.println("The number is not palindrome");
		}
	}
	static int reverse(int num)
	{
		int sum=0,remainder;
		while(num>0)
		{
			remainder=num%10;
			sum=sum*10+remainder;
			num/=10;
		}
		return sum;
	}

}