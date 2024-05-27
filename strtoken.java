import java.util.*;
class Strtoken
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String s1=ob.nextLine();
		StringTokenizer s =new StringTokenizer(s1,",");
		while(s.hasMoreTokens())
		{
			String s2=s.nextToken();
			int s3=Integer.parseInt(s2);
			System.out.println(s3);
		}
	}
}
