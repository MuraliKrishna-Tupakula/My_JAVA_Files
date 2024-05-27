import java.util.*;
import java.lang.Exception;
class ToolargeException extends Exception
{
	public ToolargeException  (String msg)
	{
		super(msg);
	}
}
class ToosmallException extends Exception
{
	public ToosmallException (String msg)
	{
		super(msg);
	}
}
class Testdemo1
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		//System.out.println("enter a age");
	for(int i=0;i<3;i++)
	{
		System.out.println("enter a age");
		 try
		{
			int a=ob.nextInt();
			if(a==10)
			{
			 System.out.println("you gussed a good number");
			break;
			}
				
			else if(a<10)
			{
				throw new ToosmallException("too small integer");
			}
			else if(a>10)
			{
			 throw new ToolargeException("too large integer");
			}
			else
			{
			 System.out.println("you gussed a good number");
			}
		}
		catch(ToosmallException e)
		{
			e.printStackTrace();
		}
		catch(ToolargeException e)
		{
			e.printStackTrace();
		}
	}
	}
}


