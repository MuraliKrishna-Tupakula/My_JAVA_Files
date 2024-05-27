import java.lang.Exception;
class First extends Thread
{
	public void run()
	{
		try{

			for(int i=0;i<=5;i++)
			{
			System.out.println("first thread is "+i);
			}
			sleep(2000);
		  }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		try{

			for(int i=0;i<=5;i++)
			{
			System.out.println("second thread is "+i);
			}
		
		  }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Joindemo
{
	public static void main(String args[])
	{
		First ob= new First();
		Second ob1= new Second();
		ob.start();
		try
		{
			ob.join();
		}
		catch(Exception e)
		{
			
		System.out.println(e);
		}
		ob1.start();
	}
}

