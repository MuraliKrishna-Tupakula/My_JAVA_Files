import java.lang.Exception;
class Resource
{
	int n;
	boolean status=false;
	synchronized void get( )
		{
			
			try
			{
				while(!status)
				{
					wait();
				}
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("got "+n);
			status=false;
			notify();
		}
		synchronized void put( int x)
		{
			try
			{
				while(status)
				{
					wait();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			n=x;
			System.out.println("put"+n);
			status=true;
			notify();


		}
}
class Producer extends Thread
{
	Resource r;
	Producer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			r.put(i);
		}
	}
}
class Consumer extends Thread
{
	Resource r;
	Consumer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			r.get();
		}
	}
}
class InterThread
{
	public static void main(String args[])
	{
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		p.start();
		c.start();
	}
}
