import java.util.Scanner;
import java.util.Random;
public class RandomNumber{
public static void main(String args[])
{
	Random rdm=new Random();
	int x=rdm.nextInt(10);
	System.out.println("The Random number is:"+x);
}
}