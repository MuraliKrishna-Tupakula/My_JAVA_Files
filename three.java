import java.util.*;
class Three
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a,b,c value");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(" a is big ");
			}
			else
			{
				System.out.println(" b is big ");
			}
		}	
		else
		{
			if(b>c)
			{
				System.out.println(" b is big");
			}
			else
			{
				System.out.println(" c is big ");
			}
		}
	}

}	
