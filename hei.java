class Base
{
	void display1()
	{
		System.out.println("base class");
	}
	
}
class Derive extends Base
{
	void display2()
	{
		System.out.println("derive from base class");
	}

}
class Derived extends Base
{
	void display3()
	{
		System.out.println("derived from base class");
	}

}
class Inherit
{
	public static void main(String ags[])
	{
		Derived ob=new Derived();
		ob.display1();
		Derive ob1=new Derive();
		ob1.display2();
		ob.display1();
		ob.display3();
	
	}
}

