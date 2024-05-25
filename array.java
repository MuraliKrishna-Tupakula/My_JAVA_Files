import java.util.*;
class Array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int  sum=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is "+sum);
	}
}
