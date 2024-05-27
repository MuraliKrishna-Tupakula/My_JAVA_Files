class Command
{
	public static void main(String args[])
	{
		System.out.println("count is "+args.length);
		int i,total=0;
		int ar[ ]=Integer.parseInt(args[i]);
		for(i=0;i<args.length;i++)
		{
			if(args[i]%2==0)
			{
				total=total+ar[i];
			}
			else
			{
				total=total-ar[i];
			}
		}
		System.out.println(total);
		
	}
}
