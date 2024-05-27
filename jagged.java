import java.util.*;
class Jagged
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("enter the ROWsize");
		int row=s.nextInt();
		int a[][]=new int[row][ ];
		System.out.println("enter array elements");
		for(i=0;i<row;i++)
		{
			System.out.println("enter column size" +i +"row");
			int col=s.nextInt();
			a[i]=new int[col];	
		}
		System.out.println("enter jagged array elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
			
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}	
