import java.util.*;
 
 class Array{
 	public static void main(String[] args) {
 		Scanner sc= new Scanner(System.in);
 		int rows,cols;
 		System.out.print("Enter the Number of rows:");
 		rows=sc.nextInt();
 		System.out.print("Enter the Number of colums:");
 		cols=sc.nextInt();
 		int[][] arr1=new int[rows][cols];
 		System.out.println("Enter "+cols*rows+" values in array:");
for(int i=0;i<rows;i++)
{
	for(int j=0;j<cols;j++)
	{
		arr1[i][j]=sc.nextInt();
	}
}
System.out.println("The values of the array is :");
for(int i=0;i<rows;i++)
{
	for(int j=0;j<cols;j++)
	{
		System.out.print(arr1[i][j]+" ");
	}
	System.out.println();
}

System.out.println("The transpose of the Array is:");
for(int i=0;i<rows;i++)
{
	for(int j=0;j<cols;j++)
	{
		System.out.print(arr1[j][i]+" ");
	}
	System.out.println();
}
 	}
 }