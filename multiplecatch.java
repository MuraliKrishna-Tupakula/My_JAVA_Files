import java.util.*;
class Multiple
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a string");
		String s=ob.next();
		int a,b,c;
		System.out.println("enter a value");
		a=ob.nextInt();
		System.out.println("enter b value");
		b=ob.nextInt();
		try
		{
			
			int x=Integer.parseInt(s);
			System.out.println("x is "+x);
			c=a/b;
			System.out.println("c is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			
			e.printStackTrace();
		}
		finally
		{
			System.out.println("after multiple catch blocks");
		}
		
		
	}
}
