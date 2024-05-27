import java.util.*;
import java.lang.Exception;
class Testtwoex
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a  1st integer");
		String s1=ob.next();
		System.out.println("enter a  2nd integer");
		String s2=ob.next();
		try
		{
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int c=x/y;
			System.out.println("c is "+c);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}


