class First extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("first thread is "+i);
		}
	}
}
class Threaddemo
{
	public static void main(String args[])
	{
		First ob= new First();
		ob.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread is "+i);
		}
	}
}
