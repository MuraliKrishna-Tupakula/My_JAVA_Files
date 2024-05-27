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
		System.out.println("derive class");
	}

}
class Derived extends Derive
{
	void display3()
	{
		System.out.println("derived class");
	}

}
class Inheri
{
	public static void main(String ags[])
	{
		Derived ob=new Derived();
		ob.display1();
		ob.display2();
		ob.display3();
	}
}

