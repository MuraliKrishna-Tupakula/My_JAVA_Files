import java.util.*;
class Outer1
{
	static int a,b;
	Outer1(int x,int y)
	{
		a=x;
		b=y;
	}
	static class Inner1
	{
		void display()
		{
			System.out.println(" a is "+a+"\t"+"b is "+b);
		}
	}
}

class Innerdemo
{
	public static void main(String args[])
	{
		Outer1 s1=new Outer1(9,6);
		Outer1.Inner1 ob=new Outer1.Inner1();
		ob.display();
	}
}

