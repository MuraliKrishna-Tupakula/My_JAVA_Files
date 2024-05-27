import java.util.*;
class Retobj
{
	int a,b;
	Retobj ()
	{
		this.a=a;
		this.b=b;
	}	
	Retobj (int a,int b)
	{
		this.a=a;
		this.b=b;
	}	
	Retobj compute(Retobj o)
	{
		o.a=o.a+10;
		o.b=o.b-10;
		return o;
	}
	void display()
	{
		System.out.println("ais"+a+"b is "+b);
	}
}
class Return
{
	public static void main(String args[])
	{
	  Retobj s=new Retobj();
		s.display();	
	  Retobj s1=new Retobj(10,20);
		s1.display();
	  s=s1.compute(s1);
		s.display();
	}
}
