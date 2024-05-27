import java.util.*;
class First extends Thread
{
	
	public void run()
	{
		System.out.println(currentThread.getName());
	}
}
class Namingthreads
{

	public static void main(String args[])
	{
		First f1=new First();
		First f2=new First();
		System.out.println(f1.getName());
		System.out.println(f2.getName());	
		f1.setName("CSE");
		f2.setName("CSE_JAVA");
		f1.start();
		f2.start();	
	}
}
