import java.util.*;

class ArrArithmatic{
			int[][] arr1=Input();
		int[][] arr2=Input();
	public static void main(String[] args) {
		int rows, cols;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		rows=sc.nextInt();
		System.out.print("Enter the number of columns:");
		cols=sc.nextInt();

	}
	public static int[][] Input()
	{
		System.out.println("Enter the values in array1:");
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
int arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values in array2:");
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				static int arr1[i][j]=sc.nextInt();
			}
		}
	} 
}