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
		System.out.println("derive from base class");
	}

}
	
class Inherita
{
	public static void main(String ags[])
	{
		
		Derive ob1=new Derive();
		ob1.display();
		
	
	}
}

