import java.lang.Exception;
class Resource
{
	synchronized void display(String name)
		{
			System.out.println("["+name);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("]");
		}
}
class First extends Thread
{
	Resource r;
	String name;
	First(Resource r,String n)
	{
		this.r=r;
		name=n;
	}
	public void run()
		{
			r.display(name);

		}	
}
class Syn
{
	public static void main(String args[])
	{
		Resource r=new Resource();
		First f1=new First(r,"hi");
		First f2=new First(r,"hello");
		First f3=new First(r,"welcome");
		f1.start();
		f2.start();
		f3.start();
	}
}
