import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}	
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}	
