import java.util.Scanner;
import java.lang.Math;

public class gen_RandomNumber{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		double num=(Math.random())*100;
		System.out.println("The random number generated is:"+num);
		System.out.println("");
		System.out.println("Choose if you want random number between range:\n 1.Yes \n 2.No");
		char ch=sc.next().charAt(0);
		if(ch=='Y'||ch=='y')
		{
			System.out.println("Enter the max number:");
			int max=sc.nextInt();
			System.out.println("Enter the min number:");
			int min=sc.nextInt();
			random(max, min);
		}			
	}
	public static void random(int max,int min)
	{
			double n=Math.random();
			System.out.println((int)(n*100));
			System.out.println((int)n*(max-min+1)+min);	
	}
	}