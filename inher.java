class Base
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	
}
class Derive extends Base
{
	void display()
	{
		System.out.println("a is "+a +"\t"+"b is "+b);
	}

}
class Inher
{
	public static void main(String ags[])
	{
		Derive ob=new Derive();
		ob.getdata(6,7);
		ob.display();
	}
}

