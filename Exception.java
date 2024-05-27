import java.util.*;
class Excep
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a value");
		a=ob.nextInt();
		System.out.println("enter b value");
		b=ob.nextInt();
		try
		{
			System.out.println("inside try block");
			c=a/b;
			System.out.println("c is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
