class Statdemo
{
	
	static int y;
	void setdata (int y)
	{
		this.y=y;
	}
	static void display()
	{
		System.out.println("y is "+y);
	}
}
class  Statd
{
	public static void main(String args[])
	{
		Statdemo s1=new Statdemo();
		s1.setdata(10);
		Statdemo.display();
	}
}
	
