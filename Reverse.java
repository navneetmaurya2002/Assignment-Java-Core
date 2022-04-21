import java.util.Scanner;

public class Reverse{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to reverse it:");
		
		// taking user input
		int n=sc.nextInt();
		// calling method into print statement
		int reverse=reverse(n);
		System.out.println("The Reverse of the number is :"+ reverse);
		checkPalindrome(n,reverse);
		
		}
	public static int reverse(int n)
	{
		//declaring remainder and reverse variable
			int remainder,reverse=0;
			
		//while(n!=0)
			for(;n>0;)
		{
	// getting last digit as remaider by dividing with 10
		remainder=n%10;
		
		// storing reverse number 
		reverse=reverse*10+remainder;
		// removing last digit from n
		n=n/10;
		}
		//returning reverse number 
		return reverse;
	}
	public static void checkPalindrome(int n,int reverse)
	{
	if(n==reverse)
		System.out.print("Entered Number is Palindrome.");
	else
		System.out.print("Entered Number is not Palindrome.");
	}
}