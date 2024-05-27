import java.util.*;
import java.lang.Exception;
class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
}
class Testdemo
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a age");
		try
		{
			int a=ob.nextInt();
			if(a<0)
			{
				throw new AgeException("expected positive integer");
			}
			else
			{
				System.out.println("welcome to voting portal");
			}
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
	}
}


