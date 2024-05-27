import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner ob= new Scanner(System.in);
		System.out.println("enter a line of integers");
		String s=ob.nextLine();
	        int i,se=0,so=0;
		String a[]=s.split(" ");
		int as[]=new int[a.length];
		for(i=0;i<a.length;i++)
		{
			as[i]=Integer.parseInt(a[i]);
		}
		for(i=0;i<as.length;i++)
		{
			if(as[i]%2==0)
			{
				se=se+as[i];
			}
			else
			{
				so=so+as[i];
			}
		}
		
		System.out.println("sum even  "+se);
		System.out.println("sum odd  "+so);
			
			
	}
}


