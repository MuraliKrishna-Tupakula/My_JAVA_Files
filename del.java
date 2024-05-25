import java.util.*;
class Del
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the position to delete");
		int pos=s.nextInt();
		for(i=0;i<n;i++)
		{
			
				if(i==pos)
				{
					a[i]=a[i+1];
				}
				
				
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]);	
		}
	}
}
