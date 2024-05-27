class Thisdemo
{
	int x,y;
	Thisdemo(int x,int y)
	{
		this.x=x;
		this.y=y;
	}	
	void display()
	{
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
class This
{
	public static void main(String []args)
	{
		Thisdemo ob=new Thisdemo(10,20);
		ob.display();
	}
}
