import java.util.*;
class Qua
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,c,d;
		double r1,r2;
		System.out.println("enter a a,b,c values");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=b*b-4*a*c;
		r1=(-b+Math.sqrt(d))/2*a;
		r2=(-b-Math.sqrt(d))/2*a;
		if(d==0)
		{
			
			System.out.println("roots are real and equal");
		}
		else if(d>0)
		{
			System.out.println("roots are real"+r1 +r2);
		}
		else
		{
			System.out.println("roots are imaginary");
		}
	}
}

		
