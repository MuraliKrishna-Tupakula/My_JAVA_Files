class Base
{
	int i=5;
}
class Derive extends Base
{
	int i=10;
	void display()
	{
		System.out.println(i);
		System.out.println(super.i);
	}

}
	
class Inh
{
	public static void main(String ags[])
	{
		
		Derive ob1=new Derive();
		ob1.display();
		
	
	}
}

