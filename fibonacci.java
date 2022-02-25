import java.util.Scanner;

public class fibonacci{
	public static Scanner sc=new Scanner(System.in);
			public void series()
			{
				int n1,n2,n3,count;
				System.out.println("Enter the first and the second number :");
				System.out.print("Number 1:");
				n1=sc.nextInt();
				System.out.print("Number 2:");
				n2=sc.nextInt();
				System.out.print("Enter the number of iteration:");
				count=sc.nextInt();
				System.out.print(n1+" "+n2);
				for(int i=1;i<count-1;i++)
				{
					n3=n1+n2;
					n1=n2;
					n2=n3;
					System.out.print(" "+n3);
				}
			}
			public static void main(String args[])
			{
				fibonacci f=new fibonacci();
				f.series();
			}
}