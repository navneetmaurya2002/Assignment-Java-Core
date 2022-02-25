import java.util.Scanner;
public class palindrome_word{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String original,reverse="";
		System.out.println("Enter the text/ number:");
		original=sc.next();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("The word is palindrome.");
		}
		else {
			System.out.println("The word is not palindrome.");
		}
	}
}