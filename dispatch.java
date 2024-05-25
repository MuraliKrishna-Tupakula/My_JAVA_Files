class Base
{
	void display()
	{
		System.out.println("base class");
	}
}
class Derive extends Base
{
	void display()
	{
		System.out.println("Derive class");
	}
}
class Derived extends Derive
{
	void display()

	{	
		System.out.println("Derived class");
	}
}
class Driver
{
	public static void main(String args[])
	{
		Base ob=new Base();
		Derive ob1=new Derive();
		Derived ob2=new Derived();
		ob.display();
		ob=ob1;
		ob.display();
		ob=ob2;
		ob.display();
	}
}

		
