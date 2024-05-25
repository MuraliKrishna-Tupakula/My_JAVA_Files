import java.util.*;
class Consdemo
{
	int a,b;
	Consdemo()
	{
		a=10;
		b=20;
	}	
	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	
}
class Cons
{
	public static void main(String args[])
	{
		
		Consdemo ob=new Consdemo();
		ob.display();
		
	}
}

