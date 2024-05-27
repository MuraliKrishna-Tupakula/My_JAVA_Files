class Base
{
	int x,y;
	Base (int a,int b)
	{
		x=a;
		y=b;
	}
	
}
class Derive extends Base
{

	void display()
	{
		System.out.println(super.x+"  " +super.y);
	}

}
	
class Inhe
{
	public static void main(String ags[])
	{
		Derive(int a ,int b)
	{
		super(a,b);
		
	}
		Derive ob1=new Derive(20,40);
		ob1.display();
		
	
	}
}


