interface Inter1
{
	void show();
}
interface Inter2 extends Inter1
{
	void display();
}
class Derived implements Inter2
{
	public void show()
	{
		System.out.println("interface of 1");
	}
	public void display()
	{
		System.out.println("interface  of 2");
	}
	void display1()
	{
	    System.out.println("derived from inter2");
	}
		
}
class Multilevel
{
	public static void main(String args[])
	{
		Derived ob=new Derived();
		ob.show();
		ob.display();
		ob.display1();
	}
}

