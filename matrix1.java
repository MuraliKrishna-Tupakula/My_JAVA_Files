import java.util.*;
class Matrix1
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
		int sum=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}	
			}
			
		}
		
		System.out.println("sum of diagnl elements "+sum);	
		
		
	}
}	
