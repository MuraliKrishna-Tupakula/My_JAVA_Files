class Thisdemo1
{
	int x,y;
	Thisdemo1(int x,int y)
	{
		x=x;
		y=y;
	}	
	void display()
	{
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
class This1
{
	public static void main(String []args)
	{
		Thisdemo1 ob=new Thisdemo1(10,20);
		ob.display();
	}
}
