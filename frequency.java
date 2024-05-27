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
		int f[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			f[i]=-1;
		}
		int count;
		for(i=0;i<n;i++)
		{
			count=1;
			if(f[i]==-1)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						f[j]=0;
					}		
				}
				f[i]=count;
			}
		
		}
		
