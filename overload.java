class Overload
{
	void display()
	{
		System.out.println("no arguments");
	}	
	void display(int x)
	{
		System.out.println("x is"+x);
	}
	void display(int x,int y)
	{
		System.out.println("x is"+x+"y is "+y);
	}
}
class Overl
{
	public static void main(String args[])
	{
		Overload s=new Overload();
		s.display();
		s.display(10);
		s.display(20,30);
	}
}
