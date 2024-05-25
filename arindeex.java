class ArrayIndex
{
	public static void main(String args[])
	{
		
		int a[]={10,556,67,34,56};
		try
		{
			System.out.println("inside try block");
			System.out.println(a[0]);
			System.out.println(a[10]);
			System.out.println("completed try block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
	
		   System.out.println("end of main block");
		}
		System.out.println("end of main block");
	}
}
