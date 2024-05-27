class Base
{
	void display()
	{
		System.out.println("this is base class");
	}
}
interface Inter
{
	void display1();
}
class Derived extends Base implements Inter
{
	public void display1()
	{
		System.out.println("this inteface ");

	}
	 void display2()
	{
		
		System.out.println("this is derived class");

	}
}
class Derived1 extends Derived
{

	void display3()
	{
		System.out.println("this is derived2 class");

	}	
}
class Hy
{
	public static void main(String args[])
	{
		Derived1 ob=new Derived1();
		ob.display3();
		ob.display2();
		ob.display1();
		ob.display();
		
	}
}	
