import java.util.*;
class Str5
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a line of text");
		String s1=ob.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.replace(2,5,"welcome");
		System.out.println(sb);
		String s3=s1.substring(s1.length()-3,s1.length());
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=sb1.delete(s1.length()-3,s1.length());
		System.out.println(sb2);
		sb1.insert(0,s3);
		System.out.println(sb1);
		
	}
}

