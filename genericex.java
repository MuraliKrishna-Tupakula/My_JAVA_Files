import java.util.*;
//import java.lang.Exception;
class Generic
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a value");
		a=ob.nextInt();
		System.out.println("enter b value");
		b=ob.nextInt();
		int ar[]={10,556,67,34,56};
		try
		{
			c=a/b;
			System.out.println("c is "+c);
			System.out.println(ar[40]);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
