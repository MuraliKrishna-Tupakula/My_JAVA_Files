import java.util.*;
import java.lang.Exception;
class Nestedtry
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a string");
		String s=ob.next();
		System.out.println("enter a index position to access");
		int i=ob.nextInt();
		try
		{

			System.out.println(s.charAt(i));
			try
			{
				System.out.println("enter a array size");
				int n=ob.nextInt();
				int ar[]=new int[n];
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e)	;
			}
		}
		catch(Exception st)
		{
			st.printStackTrace();
		}
		
	}
}
