

import java.util.Scanner;

public class isPrime{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);	
	int num;
	System.out.print("Enter the Number to check:");
	num=sc.nextInt();
	isPrime(num);
	
}
public static void isPrime(int n)
{
	int count=0;
	for(int i=2;i*i<=n;i++)
	{
		if(n%i==0)
			count++;
	}
	if(count==0)
	{
		System.out.print("Prime");
	}
	else 
		System.out.print("Not Prime");
	
}
}