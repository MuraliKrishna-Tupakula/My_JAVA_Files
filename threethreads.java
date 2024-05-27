import java.lang.Exception;
class First extends Thread
{
	public void run()
	{
              try
		{

		   for(int i=0;i<=5;i++)
		  {
			System.out.println("Hello"+i);
			sleep(1000);
		   }
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
              try
		{

		   for(int i=0;i<=5;i++)
		  {
			System.out.println("welcome"+i);
			sleep(1000);
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Third extends Thread
{
	public void run()
	{
              try
		{

		   for(int i=0;i<=5;i++)
		  {
			System.out.println("Good morning"+i);
			sleep(1000);
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Threethreads
{
	public static void main(String args[])
	{
		First f= new First();
		Second s=new Second();
		Third t=new Third();
		f.start();
		s.start();
		t.start();	
	}
}
