import java.util.*;
//import java.lang.Exception;
class Throwdemo
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a age");
		int i=ob.nextInt();
		try
		{
			if(i<18)
			{
				throw new ArithmeticException("not elgible to vote");
			}
			else
			{
				System.out.println("welcome to voting portal");
			}
		}
		catch(Exception s)
		{
			s.printStackTrace();
		}
	}
}
