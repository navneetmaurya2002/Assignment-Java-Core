//Ascii Values
import java.util.Scanner;
public class Ascii{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int ascii_1=ch;
		// by assingning the char value to int type 
		System.out.println("The ascii value of "+ch+" by assigning is :"+ascii_1);
		// by Type casting 
System.out.println("The ascii value of "+ch+" by type casting is :"+(int)ch);		

for(int i=0;i<=255;i++)
{
	System.out.println((char)i+"="+i);
}

	}
}