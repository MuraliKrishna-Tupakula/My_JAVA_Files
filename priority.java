import java.util.*;
class Demo extends Thread
{
	String name;
	Demo(String n)
	{
		name=n;
	}
	public void run()
	{
		System.out.println("name is"+name);
	}
}
class Prioritydemo
{

	public static void main(String args[])
	{
		Demo d1 =new Demo("cse");
		Demo d2=new Demo("it");
	
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());	
		d1.setPriority(7);
		d2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(d1.getPriority());
		System.out.println(d2.getPriority());
		d1.start();
		d2.start();	
	}
}
