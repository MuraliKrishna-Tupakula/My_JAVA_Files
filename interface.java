interface Inter1
{
	void show();
}
interface Inter2
{
	void display();
}
class Derived implements Inter1,Inter2
{
	public void show()
	{
		System.out.println("interface 1");
	}
	public void display()
	{
		System.out.println("interface 2");
	}
}
class Multi
{
	public static void main(String args[])
	{
		Derived ob=new Derived();
		ob.show();
		ob.display();
	}
}

