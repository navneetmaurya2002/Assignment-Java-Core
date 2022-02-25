import java.util.*;

class accept_user_input{

	public static void main(String[] args) {
		System.out.println(" Select one of the following option:");
		System.out.println("1. Greater among all");
		System.out.println("2. Check Positive or Negative");
		System.out.println("3. check even or odd and print cube of even number");
		System.out.println("4. Vowel or Not");
Scanner sc=new Scanner(System.in);
int option =sc.nextInt();
switch(option)
{
case 1:
	int num1,num2,num3;                          //Initializing the variable for input
	System.out.println("Enter Three Numbers to find the Greater among all:");
	num1=sc.nextInt();                           // Taking input using scanner 
	num2=sc.nextInt();                           // Taking input using scanner 
	num3=sc.nextInt();                           // Taking input using scanner 
    if(num1>num2 && num1>num3)            // checking the condition for num1
    {
	System.out.println("The Greater Number among all is:"+num1);
    }
    else if (num2>num1&& num2>num3)   //checking the condition for num2
{	
	System.out.println("The Greater Number among all is:"+num2);
}
else if (num3>num1&& num3>num2)   // checking the condition for num3
{
	System.out.println("The Greater Number among all is:"+num3);
}
	break;


	case 2:
	System.out.println("Enter number to check Positive or Negative Number");
	int num=sc.nextInt();
	if(num>0)
		System.out.println("The given Number is \"Positve\"");
	else if(num<0)
		System.out.println("The given Number is \"Negative\"");
	else
		System.out.println("Enter the Number except zero");
	break;

	case 3:
	System.out.println("Enter the number to check it is even or not");
	int n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println("The given number is even");
		System.out.println("The Cube of the number is:"+(n*n*n));
	}
	else if(n%2!=0)
	{
		System.out.println("The given number is odd");
	}
	else
	System.out.println("Enter number other than zero");
    break;

    case 4:
    System.out.println("Enter a Character to check it is vowel or not");
    char character=sc.next().charAt(0);
    switch(character)
   {
   	case 'a':
   	case 'A': 
   	case 'e':
   	case 'E': 
   	case 'i':
   	case 'I':
   	case 'o':
   	case 'O':
   	case 'u':
   	case 'U':System.out.println("The Entered character is vowel");
   	break;
   	default:
   	System.out.println("The Entered character is consonant");
   	break;
   }
}
}
}