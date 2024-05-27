import java.util.*;
class Firsts extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class Namingths
{

	public static void main(String args[])
	{
		Firsts f1=new Firsts();
		Firsts f2=new Firsts();
		System.out.println(f1.getName());
		System.out.println(f2.getName());	
		f1.setName("CSE");
		f2.setName("CSE_JAVA");
		f1.start();
		f2.start();	
	}
}

