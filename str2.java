import java.util.*;
class Inte
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a line of integers ");
		String s1=ob.nextLine();
		StringTokenizer s =new StringTokenizer(s1,",");
		int sum=0;
		while(s.hasMoreTokens())
		{
			String s2=s.nextToken();
			System.out.println(s2);
			int s3=Integer.parseInt(s2);
			sum=sum+s3;
		}
		System.out.println("sum of integers is "+sum);
		
	}
}

