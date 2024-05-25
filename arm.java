import java.util.*;
class Arm
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,d;
		System.out.println("enter a n value");
		n=s.nextInt();
		double temp=n;
		double sum=0;
		int count=0;
		while(n>0)
		{
			d=n%10;
			count=count+1;
			n=n/10;
		}
		while(n>0)
		{
			d=n%10;
			sum=sum+Math.pow(d,count);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not an armstrong number");	
		}
	}
}
				
