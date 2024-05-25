import java.util.*;
class Countw
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a string");
		String st=ob.nextLine();
		int i,c=0,s=0;
		for(i=0;i<st.length();i++)
		{
			int j=st.charAt(i);
			if(j==" ")
			{
				s=s+1;
			}
		}
		
		for(i=0;i<st.length();i++)
		{
			if(st.charAt(i))
			{
				c=c+1;
			}
		}
		
		System.out.println("words is"+s);
		System.out.println("chracters is"+c);
	}
} 
