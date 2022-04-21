import java.util.Scanner;

public class CalculateGrossSalary{
public static void main(String args[])
{
	double BasicSalary;
	// Message to take input from user
	System.out.print("Enter Basic Salary:");
	// object for scanner
	Scanner sc=new Scanner(System.in);
	// taking input from user
	BasicSalary=sc.nextDouble();
	
	// passing basic salary to method GrossSalary
	System.out.println("The GrossSalary of the Employee is: "+GrossSalary(BasicSalary)	);	
	}

public static double GrossSalary(double BasicSalary)
{
	// declaring variables
	double GrossSalary,DA,HRA;    // DA for Dearness Allowance and HRA for House Rent Allowance
	if(BasicSalary<1500)
	{
		// logic for calculating DA and HRA and GrossSalary
		DA=(BasicSalary*50)/100;
		HRA=(BasicSalary*10)/100;
		
	}
	else 
	{
				// logic for calculating DA and HRA and GrossSalary

		DA=(BasicSalary*90)/100;
		HRA=500;
	}
	GrossSalary=BasicSalary+DA+HRA;
	return GrossSalary;
	
}
}