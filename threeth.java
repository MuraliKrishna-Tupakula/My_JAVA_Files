import java.lang.Exception;
import java.util.Random;
class First extends Thread
{
	public void run()
	{
		Random r=new Random();
		int num;
              try
		{

		   for(int i=1;i<=10;i++)
		  {
			num=r.nextInt(50);
			System.out.println("random integer is "+num);
		
			if(num%2==0)
			{
				Second s=new Second(num);
				s.start();
			}
			else
			{
				Third t=new Third(num);
				t.start();
			}
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
	 int num;
	Second(int n)
		{
			num=n;
		}
	

		public void run()
		{
			System.out.println("square of number is"+(num*num));
		}	
	
}
class Third extends Thread
{
	 int num;
		Third(int n)
		{
			num=n;
		}
	
            
		
		public void run()
		{
			System.out.println("cube of number is"+(num*num*num));
		}	
	
}

class Threeth
{
	public static void main(String args[])
	{
		First f= new First();
		f.start();	
	}
}
