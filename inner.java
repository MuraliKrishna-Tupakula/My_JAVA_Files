class Outer
{
	int a,b;
	Outer(int x,int y)
	{
		a=x;
		b=y;
	}
	class Inner
	{
		void display()
		{
			System.out.println(" a is "+a+"b is "+b);
		}
	}
}
class Innerdemo
{
	public static void main(String ags[])
	{
		Outer o=new Outer(5,6);
		Outer.Inner ob=o.new Inner();
		ob.display();
	}
}

